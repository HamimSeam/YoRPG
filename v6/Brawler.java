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
		defense = 1;
		strength = strength * 4;
	}
}
