package lesson15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File carDemoFile = new File("C:\\iotest\\CarDemo");
		try {
			FileOutputStream os = new FileOutputStream(carDemoFile);
			ObjectOutputStream  oos = new ObjectOutputStream(os);
			Car bmw = new Car("bmw","red");
			Car opel =new Car("opel", "black");
			oos.writeObject(bmw);
			oos.writeObject(opel);
			os.close();
			System.out.println(opel.toString());
			System.out.println(bmw.toString());
			
			FileInputStream is = new FileInputStream(carDemoFile);
			ObjectInputStream ois =  new ObjectInputStream(is);
			Car isBmw = (Car)ois.readObject();
			Car isOpel= (Car)ois.readObject();
			System.out.println(isOpel.toString());
			System.out.println(isBmw.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
