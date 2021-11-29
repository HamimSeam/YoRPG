public class Character {
	//private public
	private int health;
	private int strength;
	private int defense;
	private double atkRating;

	Character(){
	    health = 0;
	    strength = 0;
	    defense = 0;
	    atkRating = 0.0;
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
