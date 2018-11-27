import java.io.*;
public class Stream31{
	public static void main ( String [] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Introdueix un fitxer ");
		String file = reader.readLine();
		File fichero = new File (file);  // declaración fichero
		FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero
		char[] buf = new char[1];		
		while ((flu.read(buf))!=-1){     //Vamos leyendo carácter a carácter
			System.out.print (buf); //hacemos 
		}
		flu.close();
	}}
