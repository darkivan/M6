import java.io.*;
public class ex4{
	// Añade al programa anterior las instrucciones necesarias para que envíe un mensaje de error en caso de que el directorio pasado como argumento no exista.
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Directorio selecionadot");
		String directoriRead=reader.readLine();
		try{// Empieza la excepcion
			File file = new File(directoriRead);
			File[] arr = file.listFiles();
				
			for (int i = 0; i < arr.length; i++) {			
				System.out.println(arr[i].getName());
			}
		}
		catch (Exception e){// Controlamos error
			System.out.println("Error, no existe el directorio: "+ directoriRead);
		}
	}
}
