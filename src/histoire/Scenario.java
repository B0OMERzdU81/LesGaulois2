package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Asterix",8);
		Romain minus = new Romain ("Minus", 6);
		Gaulois obelix= new Gaulois("Obélix", 30);
		Druide panoramix= new Druide ("Panoramix",5,10);
		
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

		
	}

}
