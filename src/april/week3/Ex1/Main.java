package april.week3.Ex1;

class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVCR test =new TVCR();
		System.out.println(test.vcr.power);
		test.vcr.power();
		System.out.println(test.vcr.power);
	}
}

class Tv {
	boolean power; // ��������(on/off)
	int channel; // ä��

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

class VCR {
	boolean power; // ��������(on/off)
	int counter = 0;

	void power() {
		power = !power;
	}

	void play() {
		/* ������� */ }

	void stop() {
		/* ������� */ }

	void rew() {
		/* ������� */ }

	void ff() {
		/* ������� */ }
}

class TVCR extends Tv {
	VCR vcr = new VCR();
	int counter = vcr.counter;

	void play() {
		vcr.play();
	}

	void stop() {
		vcr.stop();
	}

	void rew() {
		vcr.rew();
	}

	void ff() {
		vcr.ff();
	}
	
}


