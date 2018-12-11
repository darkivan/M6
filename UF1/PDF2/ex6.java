import java.io.*;
public class ex6{
	// Realiza un programa que elimine el directorio creado en el punto anterior. Para ello habrás de eliminar todos los archivos que se encuentren dentro del directorio.
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Directorip seleccionado a borrar");
		String directoriRead=reader.readLine();
		File file = new File(directoriRead);
		File[] arr = file.listFiles();
			
		for (int i = 0; i < arr.length; i++) {			
			arr[i].delete();
		}
		file.delete();
	}
}
