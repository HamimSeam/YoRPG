public class Protagonist extends Character{
	private String name;
	private int mult;

	public Protagonist(String n) {
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
