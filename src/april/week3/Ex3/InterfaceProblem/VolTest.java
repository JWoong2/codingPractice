package april.week3.Ex3.InterfaceProblem;

public class VolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Volume[] v =new Volume[3];
		v[0] = new Speaker();
		v[1] = new Radio();
		v[2] = new TV();
		
		for(int i = 0; i< v.length; i++) {
			for(int j = 1; j<=3; j++) {
				v[i].volumeUp(400);
			}
			for(int j = 1; j<=3; j++) {
				v[i].volumeDown(300);
			}			
		}
	}
}
