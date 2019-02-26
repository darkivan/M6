import java.io.*;
public class ex1{
	//Cambia la ruta del ejemplo anterior. Utiliza una ruta absoluta a tu carpeta de descargas, por ejemplo.
	public static void main (String[] args) {
		String dir = "/home/ivanserrano/Baixades";  // directorio de descargas
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
