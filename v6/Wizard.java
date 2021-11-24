public class Wizard extends Protagonist {

	Wizard(String n) {
		name = n;
		health = 200;
		strength = 10;
		defense = 70;
		atkRating = 10.0;
	}

	public void specialize(){
		strength = 10;
		defense = 70;
		atkRating = 10.0;
		support();

	}

	public void normalize() {
			strength = 10;
			defense = 70;
			atkRating = 10.0;
			health += 30;
	}

	public void support(){
		atkRating = atkRating /2;
		defense = 100;
		health = health + 100;

	}
}
