import java.io.*;
public class ex5{
	// Realiza un programa Java que muestre la siguiente información de un fichero cualquiera: Nombre, ruta relativa, ruta absoluta, permisos y tamaño.
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Directorio seleccionado");
		String dir=reader.readLine();
		File f = new File(dir);
		System.out.println("Mida: "+f.length()/ 1024 + "  kb");
		System.out.println("Nom: "+f.getName());	
		System.out.println("Permisos: w " +f.canWrite()+" r "+f.canRead());
		System.out.println("Ruta relativa: "+f.getPath());
		System.out.println("Ruta absoluta: "+f.getAbsolutePath());
	}
}
