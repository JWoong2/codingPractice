package may.week2;

import java.io.IOException;

public class InputStreamEx {
	public static void main(String args[]) throws IOException {
		System.out.println("입력하세요..");
		int _byte;
		while ((_byte = System.in.read()) != -1) {
			if (_byte == '\r' || _byte == '\n')
				//캐리지 리턴(\r) 라인피드(\n) == enter키
				continue;
			if (_byte == 'q' || _byte == 'Q'){
				break;}
			char c = (char) _byte;
			System.out.printf("%s(%d)", c, _byte);
		}
	}
}
