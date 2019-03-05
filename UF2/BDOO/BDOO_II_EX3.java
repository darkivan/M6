import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

	public class BDOO_II_EX3 {
		
		public static void main(String[] args) throws IOException {
			
			ODB odb = ODBFactory.open("EQUIPOS.DB"); 
			Objects<Jugadores> objects = odb.getObjects(Jugadores.class);
			
			if (objects.size()==0) {
				System.out.print("No existe");
			}
			
			else {
				System.out.printf("%d Jugadores: %n", objects.size());
			}
			
			while(objects.hasNext()){
				Jugadores jug = objects.next();
				jug.setEdad(jug.getEdad()+1);
				odb.store(jug);
				System.out.printf("%s, %s, %s %s %s%n",
						jug.getNombre(), jug.getDeporte(),
						jug.getCiudad(), jug.getEdad(),jug.getPais().getNombrePais());	
			}
			odb.close(); 
		}
	}
