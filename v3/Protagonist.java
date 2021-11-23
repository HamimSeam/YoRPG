public class Protagonist extends Character{
	protected String name;
	protected int mult;

	public Protagonist(String n) {
		super(500, 100, 20, 1.0);
		name = n;
		mult = 0;
	}

	public String getName() {
		return name;
	}
/*
	public int attack(Monster m) {
		int dmg = (int)(Math.random()*100*mult);
		m.health -= dmg;
		return dmg;
	}
*/
	public void specialize() {
		mult = 2;
	}

	public void normalize() {
		mult = 1;
	}
}
