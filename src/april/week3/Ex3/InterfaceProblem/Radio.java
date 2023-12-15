package april.week3.Ex3.InterfaceProblem;

public class Radio implements Volume{
	int VolLevel;
	
	public Radio() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void volumeUp(int level) {
		// TODO Auto-generated method stub
		VolLevel += level;
		System.out.println("Raido 볼륨 올립니다 : " + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		// TODO Auto-generated method stub

		VolLevel -= level;
		System.out.println("Raido 볼륨 내립니다 : " + VolLevel);
	}
	
}
