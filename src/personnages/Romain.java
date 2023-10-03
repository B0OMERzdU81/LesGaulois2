package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement=0;
	private String texte;
	
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
	
	
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// Precondition
		assert force > 0 :"Erreur valeur force";
		int oldForce = force;
		
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		
		if (force<=0){
				parler("J'abandonne");
		}
		else {
			equipementEjecte = ejecterEquipement();
			parler("Aïe...");
			}
		
			// post condition : la force a diminuée
			assert force < oldForce;
			return equipementEjecte;
			}
	
	
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		
		if ((nbEquipement != 0)) {
			texte += "\n Mais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement; i++) {
				if ((equipement[i] != null && equipement[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} 
				if ((equipement[i] != null && equipement[i].equals(Equipement.CASQUE))) 
 {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		if (forceCoup<0) {
			forceCoup=0;
		}
		return forceCoup;
		}
	
	
	
	private Equipement[] ejecterEquipement() {
		
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipement[i]!=null) {
				equipementEjecte[nbEquipementEjecte] = equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
				}
			}
		return equipementEjecte;
		}
	
	
	
	
	
	
	
	
	public void conditionEquipement(Equipement equiper) {
		if(equipement[0]==equiper || equipement[1]==equiper){
			System.out.println("Le soldat "+nom + " possède déjà un "+ equiper.toString());
		}
		else {
			if(equipement[0]==null) {
				equipement[0]=equiper;
				nbEquipement++;
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equiper.toString() + ".");

			}
			else {
				equipement[1]=equiper;
				nbEquipement++;
				System.out.println("Le soldat " + nom + " s'équipe avec un " + equiper.toString() + ".");			
			}
		}
	}
	
	public void sEquiper(Equipement equiper) {
		if (equipement[0]!=null && equipement[1]!= null) {
			System.out.println("Le soldat "+nom + " est déjà bien protégé !");
		}
		else {
			switch (equiper) {
			case CASQUE:
				conditionEquipement(equiper);
				break;
				
			case BOUCLIER:
				conditionEquipement(equiper);
				break;
			}
		}
	}
		
	public int getForce() {
		return force;

	}
	
	
	
	
	public static void main(String[] args) {
		Romain jaximus = new Romain ("Jaximus", 5);
		Romain minus = new Romain ("Minus", 6);
		
		jaximus.prendreParole();
		jaximus.parler("Je n'aime pas me faire frapper");
		jaximus.recevoirCoup(1);
		
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
		
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
	}
	

}
