import java.io.*;

public class Stream32 {
	public static void main ( String [] args) throws IOException {
		File fout = new File("out.txt");
		FileOutputStream fos = new FileOutputStream(fout);
	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	 
		for (int i = 0; i < 10; i++) {
			bw.write("Line " + (i+1));
			bw.newLine();
		}	 
		bw.close();
	}
}
