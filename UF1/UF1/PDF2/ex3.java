import java.io.*;
public class ex3{
	// Realiza un programa Java que utilice el método listFiles() para mostrar la lista  de ficheros de un directorio que se pasará al programa desde los argumentos del main
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));// Capturamos texto por pantalla	
		System.out.println("Directorio selecionado");
		String directoriRead=reader.readLine();
		File file = new File(directoriRead);
		File[] arr = file.listFiles();// Aplicamos funcion seleccionada
			
		for (int i = 0; i < arr.length; i++) {			
			System.out.println(arr[i].getName());// Imprimimos la array selecionada
		}
	}
}
