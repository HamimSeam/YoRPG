public class Bowser extends Monster {

	Bowser() {
		health = 150;
		strength = 50;
		defense = 90;
		atkRating = 8.0;
	}

	public void about() {
		System.out.println("The big boss of the game. You better hope you can make it through this in one piece.");
	}
}
