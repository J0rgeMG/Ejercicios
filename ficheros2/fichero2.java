package ficheros2;

import java.io.*;

public class fichero2 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("C:\\Users\\J0rge\\Documents\\ficheros\\fichero1.txt");
			fw = new FileWriter("C:\\Users\\J0rge\\Documents\\ficheros\\ficheroCopia.txt");
			
			int letra = fr.read();
			while(letra != -1) {
				fw.write(letra);
			}
		}
		catch(Exception err) {
			
		}
		finally {
			if(fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
