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
		System.out.println("Raido ���� �ø��ϴ� : " + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		// TODO Auto-generated method stub

		VolLevel -= level;
		System.out.println("Raido ���� �����ϴ� : " + VolLevel);
	}
	
}
