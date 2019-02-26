import java.io.*;
import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java
public class ex2{
	//Ahora haz los cambios necesarios para que el programa anterior muestre los ficheros del directorio introducido desde línea de comandos al ejecutar el programa
	public static void main (String[] args) {
		System.out.printf("Que directorio quieres ver? ");  // directorio de descargas
		Scanner scanner = new Scanner (System.in); //Creación de un objeto Scanner
        String dir = scanner.nextLine (); //Invocamos un método sobre un objeto Scanner
		File f = new File(dir);
		String[] archivos = f.list();
		System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);
		for (int i=0; i<archivos.length; i++){
			File f2 = new File(f, archivos[i]);
			System.out.printf("Nombre: %s, es fichero?: %b, es directorio?:%b %n", archivos[i],
			f2.isFile(), f2.isDirectory());
		}
	}
}
