package may.week4.Ex5.Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {
	public static void main(String[] args) {
		
		Consumer<String> con = x -> System.out.println(x + "test");
		con.accept("Consumer");
		
		BiConsumer<String, String> bigCon = (a, b)  -> System.out.println(a+b);
		bigCon.accept("Bigcon", "test");
		
		
		Consumer<String> test = x -> System.out.println(x.charAt(0));
		ObjIntConsumer<String> obj = (a,b) -> System.out.println(a.charAt(b));
		
		test.accept("this is test");
		obj.accept("this is test", 3);
		
		
	}

}
