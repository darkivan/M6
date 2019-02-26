import java.io.*;
public class Stream12{
	public static void main ( String [] args) throws IOException {
		File fichero = new File ("Stream11.java");  // declaración fichero
		FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
		int i;
		while ((i=flu.read())!=-1)     //Vamos leyendo carácter a carácter
		System.out.print ((char) i); //hacemos 

		flu.close();
	}
}
