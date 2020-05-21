package week3.Ex1;

abstract class Unit {
	protected String name;
	protected int energe;
	protected int damage;
	protected String size;
	protected boolean flyAttack;
	abstract public void decEnerge(Unit u);

	public int getEnerge() {
		return energe;
	}
}

class Protoss extends Unit {
	boolean fly;

	public Protoss(String n, int energe, boolean b) {
		name = n;
		super.energe = energe;
		fly = b;
	}

	public void decEnerge(Unit u) {
		energe -= u.damage;
	}
}

class Terran extends Unit {
	boolean fly;

	public Terran(String n, int energe, boolean b) {
		name = n;
		super.energe = energe;
		fly = b;
	}

	public void decEnerge(Unit u) {
		energe -= u.damage;
	}
}

class Zerg extends Unit {
	boolean fly;

	public Zerg(String n, int energe, boolean b) {
		name = n;
		super.energe = energe;
		fly = b;
	}

	public void decEnerge(Unit u) {
		energe -= u.damage;
	}
}

class Zergling extends Zerg {
	int damage = 7;
	boolean flyAttack = false;

	public Zergling(String n, int energe, boolean b) {
		super(n, energe, b);
		// TODO Auto-generated constructor stub
		super.damage = this.damage;
		super.flyAttack = flyAttack;
	}
}

class Marine extends Terran {
	int damage = 10;
	boolean flyAttack = true;

	public Marine(String n, int energe, boolean b) {
		super(n, energe, b);
		// TODO Auto-generated constructor stub
		super.damage = this.damage;
		super.flyAttack = flyAttack;
	}

}

public class UnitTest {
	public static void main(String[] args) {

		Zerg[] z1 = new Zerg[50];
		int zindex = 0;
		z1[zindex++] = new Zergling("Zergling", 75, false);
		Protoss p1 = new Protoss("Corsair", 100, true);

		// 사거리, 공중 여부
		if(p1.fly && z1[0].flyAttack) {
			p1.decEnerge(z1[0]);	
		}
		
		System.out.println(z1[0].damage);
		System.out.println(p1.getEnerge());
		Terran t1 = new Terran("Marine", 50, false);

		z1[0].decEnerge(t1);
		System.out.println(t1.damage);
		System.out.println(t1.energe);
		System.out.println(z1[0].getEnerge());
	}
}