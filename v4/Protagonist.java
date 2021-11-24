public class Protagonist extends Character{
	protected String name;
	protected double mult;

	public Protagonist(String n) {
		super(500, 100, 20, 1.0);
		name = n;
		mult = 0;
	}

	public String getName() {
		return name;
	}

	public int attack(Monster m) {
		int damage;
		damage = (int) (strength*atkRating*mult) - m.defense;
		m.lowerHP(damage);
		return damage;
	}

	public void specialize() {
		mult = 1.5;
	}

	public void normalize() {
		mult = .75;
	}
}
