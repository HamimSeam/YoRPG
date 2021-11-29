public class Goomba extends Monster {

	Goomba() {
		health = 50;
		strength = 15;
		defense = 10;
		atkRating = 5.0;
	}

	public void about() {
		System.out.println("The weakest enemy by far. Nothing more than a nusiance.");
		System.out.println("Name: Goomba");
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Defense: " + defense);
		System.out.println("Attack Rating: " + atkRating);
	}
}
