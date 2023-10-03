package personnages;

public class Gaulois {
	private String nom; 
	private int effetPotion=1;
	private int force;
	private int nbtrophee;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + '"' + texte +'"'); 
	}
	

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] victoire = new Equipement [10];
		victoire=romain.recevoirCoup((force / 3) *effetPotion);
		if (victoire !=null) {
			for (int i = 0; trophees != null && i < victoire.length; i++, nbtrophee++) {
				this.trophees[nbtrophee] = victoire[i];
				}
			}
		}
	
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
		
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Asterix",8);
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("J'aime manger du sanglier");
		asterix.boirePotion(5);
		
		

	}

	
}












