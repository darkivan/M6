import java.io.*;
public class Stream11{
	public static void main ( String [] args) throws IOException {
		File fichero = new File ("Stream11.java");  // declaración fichero
		FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
		char[] buf = new char[20];
		
		while ((flu.read(buf))!=-1){     //Vamos leyendo carácter a carácter
			System.out.print (buf); //hacemos 
		}

		flu.close();
	}
}

