import java.io.*;

public class ex2a {
	public static void main ( String [] args) throws IOException {
		File fichero = new File ("Empleados.txt");  // declaración fichero
		String [] empleado = {"1:Fernandez:10:1000.45",
				"2:Gil:20:2400.60",
				"3:Lopez:10:3000.10",
				"4:Ramos:10:1520.35",
				"5:Pepito:50:1234.56",
				"6:Juanito:26:2345.50",
				"7:Wombat:37:2647.12"};

		if (fichero.exists()) {
			fichero.delete();
		} 
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));

		for (int i = 0; i < empleado.length; i++) {
			bw.append(empleado[i]+"\n");
		}

		bw.close();
	}
}
