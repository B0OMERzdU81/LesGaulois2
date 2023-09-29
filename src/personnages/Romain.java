package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquiment=0;
	
	public Romain(String nom, int force) {
		assert force>0 : "La force du romain est inférieur à 1";
		this.nom=nom;
		this.force=force;
		equipement= new Equipement[2];
	
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + '"' + texte +'"'); 
	}
	
	private String prendreParole() {
		return ("Le romain "+ nom + " : " );
		
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force>0: "La force du romain est déjà inférieur ou égale à 0";
		int i=force;
		force-=forceCoup;
		if(force>0) {
			parler("Aie");
		}
		else {
			parler("J'abandonne");
		}
		assert i>force: "La force du romain n'a pas diminué, il a des joues en béton";
	}
	
	public void conditionEquipement(Equipement equiper) {
		if(equipement[0]==equiper || equipement[1]==equiper){
			System.out.println("Le soldat "+nom + " possède déjà un casque");
			break;
		}
		else {
			if(equipement[0]==null) {
				equipement[0]=equipement;
			}
			if equipement
				
			}
		
	}
	public void sEquiper(Equipement equiper) {
		if (equipement[0]!=null && equipement[1]!= null) {
			System.out.println("Le soldat "+nom + "est déjà bien protégé!");
		}
		else {
			switch (equiper) {
			case CASQUE:
				conditionEquipement(equiper);
				}
				
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Romain jaximus = new Romain ("Jaximus", 5);
		Romain minus = new Romain ("Minus", 6);
		
		jaximus.prendreParole();
		jaximus.parler("Je n'aime pas me faire frapper");
		jaximus.recevoirCoup(1);
		
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
	}

}
