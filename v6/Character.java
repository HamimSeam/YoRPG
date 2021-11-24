public class Character {
	//private public
	protected int health;
	protected int strength;
	protected int defense;
	protected double atkRating;

	Character (int h, int s, int d, double a) {
	    health = h;
	    strength = s;
	    defense = d;
	    atkRating = a;
	}

	public boolean isAlive() {
		return health >= 0;
	}

	public int getDefense() {
		return defense;
	}

	public void lowerHP(int dmg) {
		health = health - dmg;
	}

	public int attack(Character c) {
		int damage;
		damage = (int)(strength * atkRating) - c.defense;
		if(damage < 0){
			damage = 0;
		}
		c.lowerHP(damage);
		return damage;
	}
}
