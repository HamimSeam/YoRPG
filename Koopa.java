public class Koopa extends Monster {

	Koopa() {
		health = 100;
		strength = 10;
		defense = 70;
		atkRating = 10.0;
	}

	public void about() {
		System.out.println("Quite a bit stronger than the Goomba. Be careful with these fools.");
		System.out.println("Name: Koopa" );
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Defense: " + defense);
		System.out.println("Attack Rating: " + atkRating);
	}
}
