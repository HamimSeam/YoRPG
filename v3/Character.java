public class Character {
	//private public
	protected int health;
	protected int strength;
	protected int defense;
	protected double atkRating;

	Character(int h, int s, int d, double a){
	    health = h;
	    strength = s;
	    defense = d;
	    atkRating = a;
	}

	public boolean isAlive() {
		if (health <= 0) {
			return false;
		}
		return true;
	}

	public int getDefense(){
	    return defense;
	}

	public int lowerHP(int dmg){
	    health = health - dmg;
	    return health;
	}

	public int attack(Character c) {
		int damage;
		damage = (int)(strength * atkRating) - c.defense;
		return damage;
	}
}
