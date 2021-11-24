public class Protagonist extends Character{
	protected String name;
	protected double mult;

	public Protagonist() {
		super(0, 0, 0, 0.0);
		name = "";
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
