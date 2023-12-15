package may.week4.Ex3.Customer;

import java.io.*;

public class ObjectInOutputStreamEx {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("d:\\object.ser");
			oos = new ObjectOutputStream(fos);
			
			//직렬화되지 못한다면 not Serial 이 뜸 
			oos.writeObject(new Customer("웅"));
			
			fis = new FileInputStream("d:\\object.ser");
			ois = new ObjectInputStream(fis);
			Customer m = (Customer) ois.readObject();
			System.out.println(m.toString());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (ois != null)
					ois.close();
				if (fos != null)
					fos.close();
				if (oos != null)
					oos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}