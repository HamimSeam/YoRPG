public class Koopa extends Monster {

	Koopa() {
		health = 100;
		strength = 10;
		defense = 70;
		atkRating = 10.0;
	}

	public void about() {
		System.out.println("Quite a bit stronger than the Goomba. Be careful with these fools.");
	}
}
