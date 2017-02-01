package lesson15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		File file = new File("C:\\iotest\\test.txt");
		File fileWrite = new File("C:\\iotest\\testCopy.txt");
		if(!fileWrite.exists()){
			try {
				fileWrite.createNewFile();
			} catch (IOException e) {
				System.out.println("File not created");
			}
		}
		
		try {
			FileReader reader = new FileReader(file);
			FileWriter writer = new FileWriter(fileWrite);
			BufferedReader bufferedReader = new BufferedReader(reader);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			String line;

			do{
				line = bufferedReader.readLine();
				bufferedWriter.flush();
				bufferedWriter.write(line);
			}
			while(line!=null);
			
			bufferedReader.close();
			bufferedWriter.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
