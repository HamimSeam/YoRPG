public class Archer extends Protagonist {

	Archer(String n) {
		name = n;
		health = 100;
		strength = 10;
		defense = 70;
		atkRating = 30.0;
	}

	public void specialize(){
		strength = 10;
		defense = 70;
		atkRating = 30.0;
		flameshot();

	}

	public void normalize() {
			strength = 10;
			defense = 70;
			atkRating = 10.0;
			health += 10;
	}

	public void flameshot(){
		atkRating = strength * 4;
		defense = 20;
		health = health - 20;
	}

	public void about() {
		System.out.println("This class packs quite a punch, but must stay far from their enemies to be most effective.");
		System.out.println("Name: " + name);
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Defense: " + defense);
		System.out.println("Attack Rating: " + atkRating);
	}


}
