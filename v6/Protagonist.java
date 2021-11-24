public class Protagonist extends Character{
	protected String name;
	//protected double mult;
	protected boolean powerup;

	public Protagonist() {
		super(0, 0, 0, 0.0);
		name = "";
		//mult = 0;
	}

	public String getName() {
		return name;
	}

/*
	public int attack(Monster m) {
		int damage;
		damage = (int) (strength*atkRating*mult) - m.defense;
		m.lowerHP(damage);
		return damage;
	}

*/
	public void specialize() {
			powerup = true;
	}

	public void normalize() {
			powerup = false;
	}

}
