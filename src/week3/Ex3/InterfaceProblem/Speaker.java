package week3.Ex3.InterfaceProblem;

public class Speaker implements Volume{
	int VolLevel;
	
	public Speaker() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void volumeUp(int level) {
		// TODO Auto-generated method stub
		if(level <= 100 && VolLevel <= 100) VolLevel += level;
		else if(level > 100) VolLevel = 100;
		else if(level < 0) level = 0;
		
		System.out.println("speak ���� �ø��ϴ� : " + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		// TODO Auto-generated method stub
		if(VolLevel-level < 0) {
			VolLevel =0;
		}else {
			VolLevel -= level;
		}
		System.out.println("speaker ���� �����ϴ� : "  + VolLevel);
	}
}