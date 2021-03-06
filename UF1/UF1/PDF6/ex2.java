import java.io.*;

public class ex2 {
	public static void main(String[] args) throws IOException {
		System.out.print("Introduce el identificador de empleado: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userInput = reader.readLine();
		int idEmpleado = Integer.parseInt(userInput);

		leerFicheroAleatorio(idEmpleado);
	}

	public static void leerFicheroAleatorio(int inputId) throws IOException {
		File fichero = new File ("AleatorioEmpleado.dat");
		RandomAccessFile file = new RandomAccessFile (fichero, "r");

		int id, dep, posicion;
		Double salario;
		char apellido[]= new char[10], aux;
		posicion = 0;

		for ( ; ; ) {
			file.seek (posicion); // Nos posicionamos en posicion
			id = file.readInt(); // Obtengo identificar de Empleado

			if (id == inputId) {
				for ( int i = 0; i < apellido.length; i++) {
					aux = file.readChar(); // Voy leyendo carácter a carácter el apellido y lo guardo
					apellido[i]=aux; // en el array apellido
				}

				String apellidos = new String (apellido);
				dep = file.readInt(); //Lectura de departamento y salario
				salario = file.readDouble();

				if (id > 0) {
					System.out.printf("ID: %s, Apellido: %s, Departamento: %d, Salario: %.2f %n", id, apellidos.trim(), dep, salario);
					break;
				} else {
					System.out.printf("El identificador no es valido");
					break;
				}
	
			} else {
				posicion += 36;
				if (posicion == file.length()) {
					System.out.println("No hay coincidencias");
					break; // Si he recorrido todo el fichero, salgo del for
				}
			}
		}

		file.close();
	}
}
