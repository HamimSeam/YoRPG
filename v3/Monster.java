public class Monster extends Character {

	Monster() {
		super(500, 100, 20, 1.0);
	}

	Monster (int h, int s, int d, double a) {
		super(h, s, d, a);
	}


/*
	public int attack(Protagonist p) {
		int dmg = (int)(Math.random() * 100 * p.mult);
		p.health -= dmg;
		return dmg;
	}
*/
}
