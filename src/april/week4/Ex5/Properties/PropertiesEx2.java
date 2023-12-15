package april.week4.Ex5.Properties;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

class PropertiesEx2 {
	public static void main(String[] args) {
		// commandline���� inputfile�� ���������� ������ ���α׷��� �����Ѵ�.
		
		
		if(args.length != 1) {
			System.out.println("USAGE: java PropertiesEx2 INPUTFILENAME");
			System.exit(0);
		}

		Properties prop = new Properties();

		String inputFile = args[0];

		try {
			 FileInputStream input=new FileInputStream(inputFile);
			prop.load(input);

		} catch(IOException e) {
			System.out.println("������ ������ ã�� �� �����ϴ�.");
			System.exit(0);
		}

		String   name = prop.getProperty("name");
		String[] data = prop.getProperty("data").split(",");
		int[] intData = Stream.of(prop.getProperty("data").split(",")).mapToInt(Integer::parseInt).toArray();
		System.out.println("max : " + Arrays.stream(intData).max());
		System.out.println("min : " + Arrays.stream(intData).min());
		System.out.println("total : " + Arrays.stream(intData).sum());
		System.out.println("avg : " + (double) Arrays.stream(intData).sum() / intData.length);
		
		int max = 0;
		int min = 0;
		int sum = 0;

		
		
		for(int i=0; i < data.length; i++) {
			int intValue = Integer.parseInt(data[i]);
			if (i==0) max = min = intValue;

			if (max < intValue) {
				max = intValue;
			} else if (min > intValue) {
				min = intValue;
			}

			sum += intValue;
		}

		System.out.println("�̸� :"  + name);		
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
		System.out.println("�հ� :"  + sum);
		System.out.println("��� :"  + (sum*100.0/data.length)/100);
	}
}
