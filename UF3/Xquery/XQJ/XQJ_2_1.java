package exists;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.xml.namespace.QName;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQPreparedExpression;
import javax.xml.xquery.XQResultSequence;
import net.xqj.exist.ExistXQDataSource;

public class XQJ_2_1 {
	public static void main(String[] args) throws XQException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		XQDataSource server = new ExistXQDataSource();
		server.setProperty ("serverName", "192.168.56.102");
		server.setProperty ("port","8080");
		server.setProperty ("user","admin");
		server.setProperty ("password","austria");
		XQConnection conn = server.getConnection();
		XQPreparedExpression consulta;
		XQResultSequence resultado;
		System.out.println("Tipo:");
		String usuario = reader.readLine();
		/* Previamente vendría la conexión a la base de datos configurando XQDataSource
		 A continuación definimos la variable $x que representa el ID de un departamento */
		consulta = conn.prepareExpression (
				"declare variable $x as xs:int external;"+
				"/universidad/departamento[@tipo='"+usuario+"']");
		
		int valor=10;
		consulta.bindInt(new QName("x"), valor, null);
		
		resultado = consulta.executeQuery();
		int contador=0;
		while (resultado.next()) {
			System.out.println(resultado.getItemAsString(null));
			contador++;
		}
		if (contador==0) {
			System.out.println("0 empleados o no existe");
		}
	}
}
