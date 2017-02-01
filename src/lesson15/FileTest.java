package lesson15;

import java.io.File;
import java.io.IOException;

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File dir = new File("C:\\iotest");
		File file = new File("C:\\iotest\\test.txt");
		
		if(!dir.exists()){
			dir.mkdir();
		}
		else{
			System.out.println("The directory exists");
		}
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else
		{
			System.out.println("file exists");
		}
		
	}

}
