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

}
