import java.io.* ;
public class ex2{
	/*Escribe un programa que inserte datos en “filesDatos.dat”. Los datos los 
	tomará de dos arrays definidos en el propio programa. Uno contendrá los 
	nombres de una serie de personas y el otro sus edades. Se irá recorriendo 
	los arrays e iremos escribiendo en el file el nombre (mediante el método 
	writeUTF(String str) y la edad (writeInt (int v)). NOTA: si queremos añadir 
	bytes al final del file (fileDatos.dat) se puede usar el siguiente 
	constructor: file1putStream file1 = new file1putStream (file, true)*/
	public static void main (String [] args) throws IOException{
		File fichero = new File ("FicheroDatos.dat");
		FileOutputStream fileout = new FileOutputStream (fichero);
		FileInputStream filein = new FileInputStream(fichero);
		DataOutputStream filedos = new DataOutputStream(fileout);
		String[] persones= {"Inigo","Luis","Marc","Ivan","Pablo","Issac","Oscar"};
		Integer[] edades = {22,20,23,24,20,22,85};
		for (int i=1; i<persones.length; i++){
			filedos.writeUTF(persones[i]);
			filedos.writeInt(edades[i]);
		}
		fileout.close();
		filedos.close();
	}
}
