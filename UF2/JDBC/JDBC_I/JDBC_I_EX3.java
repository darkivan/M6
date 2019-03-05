import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class JDBC_I_EX3 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("localidad: ");
		String mode = reader.readLine().toUpperCase();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion=DriverManager.getConnection
					("jdbc:mysql://192.168.69.10/ejemplo","austria","123");
			Statement sentencia =conexion.createStatement();
			String sql = "select apellido,emple.dept_no from emple,depart where loc ='"+mode+"' and emple.dept_no=depart.dept_no;";
			ResultSet result = sentencia.executeQuery(sql);
			while (result.next()){
				System.out.printf(
						result.getString(1)+" "+result.getInt(2)+"\n");
			}
			result.close();
			sentencia.close();
			conexion.close();
		} catch (ClassNotFoundException cn) { cn.printStackTrace();
		} catch (SQLException e) {e.printStackTrace();
		}
	}
}
