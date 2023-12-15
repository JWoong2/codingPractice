package april.week4.Ex5.Properties;

import java.util.*;
import java.io.*;

class PropertiesEx3 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		prop.setProperty("timeout","30");
		prop.setProperty("language","한글");
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");

		try {
			prop.store(new FileOutputStream("d:/output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("d:/output.xml"),  "Properties Example");
		} catch(IOException e) {
			e.printStackTrace();		
		}
	} // main의 끝
}
