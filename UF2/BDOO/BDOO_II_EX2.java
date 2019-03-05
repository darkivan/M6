import java.io.IOException;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

	public class BDOO_II_EX2 {
		
		public static void main(String[] args) throws IOException {
			
			ODB odb = ODBFactory.open("EQUIPOS.DB"); 
			int i = 1;
			ICriterion criterio1 = Where.ge ("edad", 14);
			ICriterion criterio2 = Where.le ("edad", 20);
			ICriterion criterio = Where.and().add(criterio1).add(criterio2);
			
			CriteriaQuery query = new CriteriaQuery (Jugadores.class,criterio);
			Objects<Jugadores> objects = odb.getObjects(query);
			
			if (objects.size()==0) {
				System.out.print("No existe");
			}
			
			else {
				System.out.printf("%d Jugadores: %n", objects.size());
			}
			
			while(objects.hasNext()){ 
				
				Jugadores jug = objects.next();
				System.out.printf("%d: %s, %s, %s %s %s%n",
					i++, jug.getNombre(), jug.getDeporte(),
					jug.getCiudad(), jug.getEdad(),jug.getPais().getNombrePais());	
			}
			
			odb.close(); 
		}
	}
