import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

public class BDOO_I_EX1_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String deporteSelected = reader.readLine();
		
		ODB odb = ODBFactory.open("EQUIPOS.DB"); 
		Objects<Jugadores> objects = odb.getObjects(Jugadores.class); 
		System.out.printf("%d Jugadores: %n", objects.size());
		int i = 1;

		while(objects.hasNext()){ 
			Jugadores jug = objects.next();
			if(jug.getDeporte().equals(deporteSelected)) {
				System.out.printf("%d: %s, %s, %s %s %s%n",
						i++, jug.getNombre(), jug.getDeporte(),
						jug.getCiudad(), jug.getEdad(),jug.getPais().getNombrePais());	
			}
			
			
		}
		odb.close(); 
	}
}
