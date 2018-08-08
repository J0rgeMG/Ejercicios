package ficheros1;

import java.io.*;

public class fichero1 {

	public static void main(String[] args) {
		FileReader fr = null;

		try {
			fr = new FileReader("C:\\Users\\J0rge\\Documents\\ficheros\\fichero1.txt");
			
			int letra = fr.read();
			while(letra != -1) {
				if(letra != ' ') {
					System.out.print((char)letra);
				}
				
				letra = fr.read();
			}
		}
		catch(Exception err) {
			
		}
		finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
