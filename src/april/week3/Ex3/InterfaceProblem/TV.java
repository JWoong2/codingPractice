package april.week3.Ex3.InterfaceProblem;

public class TV implements Volume{
	int VolLevel;
	
	public TV() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void volumeUp(int level) {
		// TODO Auto-generated method stub
		VolLevel += level;
		System.out.println("TV ���� �ø��ϴ� : " + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		// TODO Auto-generated method stub
		if(VolLevel-level < 0) {
			VolLevel =0;
		}else {
			VolLevel -= level;
		}
		System.out.println("TV ���� �����ϴ� : " + VolLevel);
	}
}
