import java.io.*;
public class Stream23 {
	public static void main (String [] args) throws IOException {
		tring prov[] = {"Albacete", "Avila", "Badajoz", "Caceres", "Huelva", "Jaen", "Madrid", "Segovia", "Soria", "Toledo", "Valladolid", "Zamora"}
		File fichero = new File("FicheroTexto.txt");
		FileWriter fic = new FileWriter (fichero);
		String cadena = "Esto es una prueba con FileWriter";
		char[] buf = cadena.toCharArray();
		fic.write (buf); // se va escribiendo carácter a carácter
		for (int i = 0; i < prov.length; i++
		fic.append ("*"); // añadimos un asterisco al final
		fic.close ();   // cerramos fichero
	}
}
