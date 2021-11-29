public class Goomba extends Monster {

	Goomba() {
		health = 50;
		strength = 40;
		defense = 10;
		atkRating = 5.0;
	}

	public void about() {
		System.out.println("The weakest enemy by far. Nothing more than a nusiance.");
	}
}
