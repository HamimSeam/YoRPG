public class Brawler extends Protagonist {

	Brawler(String n) {
			name = n;
			health = 100;
	    strength = 50;
	    defense = 50;
	    atkRating = 10.0;
	}
	public void specialize(){
		strength = 50;
		defense = 50;
		atkRating = 10.0;
		unlimitedBladeWorks();

	}

	public void normalize() {
			strength = 50;
			defense = 50;
			atkRating = 10.0;

	}

	public void unlimitedBladeWorks(){
		atkRating = atkRating * 2;
		defense = 10;
		strength = strength * 4;
	}

	public void about() {
		System.out.println("This class is tough and strong: get up into the enemies' faces using your Unlimited Blade Works.");
		System.out.println("Name: " + name);
		System.out.println("Health: " + health);
		System.out.println("Strength: " + strength);
		System.out.println("Defense: " + defense);
		System.out.println("Attack Rating: " + atkRating);
	}
}
