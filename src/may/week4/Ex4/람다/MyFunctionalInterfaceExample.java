package may.week4.Ex4.¶÷´Ù;


public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		fi= x -> { 
			System.out.println(x);
		};
		
		fi.method("this is test");
		
//		fi.method();
//		
//		fi = () -> { System.out.println("method call2"); };
//		fi.method();
//		
//		fi = () -> System.out.println("method call3");
//		fi.method();
	}
}
