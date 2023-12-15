package may.week4.Ex3;

import java.io.*;

public class ExternalizableEx implements Externalizable {
	private String name;
	private int age;
	private int weight;

	public ExternalizableEx() {
	}

	public ExternalizableEx(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void writeExternal(ObjectOutput objOutput) throws IOException {
		objOutput.writeObject(name);	
		objOutput.writeObject(new Integer(age));
		objOutput.writeObject(new Integer(weight));
	}

	public void readExternal(ObjectInput objInput)
			throws ClassNotFoundException, IOException {
		name = (String) objInput.readObject();
		age = ((Integer) objInput.readObject()).intValue();
		weight = ((Integer) objInput.readObject());
	}

	public String toString() {
		return "name : " + name + " , age : " + age + " , weight : " + weight;
	}

	public static void main(String[] args) {
		ExternalizableEx ex1 = new ExternalizableEx("KH", 33, 70);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fos = new FileOutputStream("d:\\external.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ex1);
			fis = new FileInputStream("d:\\external.ser");
			ois = new ObjectInputStream(fis);	
			ExternalizableEx ex2 = (ExternalizableEx) ois.readObject();
			System.out.println("¿øº» °´Ã¼ : " + ex1);
			System.out.println("º¹¿øµÈ °´Ã¼ : " + ex2);
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
