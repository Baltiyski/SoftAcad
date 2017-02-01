package lesson15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileStreams {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\iotest\\test.txt");
		File file1 = new File("C:\\iotest\\test1.txt");
		FileInputStream is = new FileInputStream(file);
		FileOutputStream os =  new FileOutputStream(file1);
		try {
			
			int b = 0;
			int array[] = new int[10];
			int i=0;
			while (b!=-1){
				b=is.read();
				array[i++]=b;
				System.out.println("read:"+b);
			}
			
			for(int j=0;j<i;j++){
				os.write(array[j]);
			}
			System.out.println(b+":end of file is reached");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			is.close();
			os.close();
		}
		
		


		
		
	}

}
