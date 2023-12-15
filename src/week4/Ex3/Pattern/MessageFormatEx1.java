package week4.Ex3.Pattern;
import java.text.*;

class MessageFormatEx1 {
	public static void main(String[] args) {
		Object[] arguments = {
			"ÀÌÀÚ¹Ù","02-123-1234", "27", "07-09"
		};
		
		String msg = "Name: {0} \nTel: {1} \nAge:{2} \nBirthday:{3}";


		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);
	}
}
