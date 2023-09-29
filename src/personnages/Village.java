package personnages;

public class Village {
	private Gaulois[] villageois;
	private Chef chef;
	private int nbVillageois=0;
	private String nom;
	
	
	public Village (String nom, int nbVillageoisMaximum) {
		this.nom=nom;
		villageois=new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois +=1;
		
	}
	
	public Gaulois trouverHabitants(int numero) {
		return villageois[numero];
		
	}
	
	public void afficherVillageois() {
		int i =0;
		System.out.println("Dans le " + nom + " du chef "+ chef.getNom()  + " vivent les légendaires gaulois : \n");
		while(villageois[i]!=null ) {
			System.out.println("- " +villageois[i].getNom());
			i+=1;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Village village=new Village("Village des Irréductibles",30);
		
		//Gaulois gaulois=village.trouverHabitants(30);
		// On obtient cette levée d'exception car le tableau de gaulois va de 0 à 29, donc 30 étant en dehors du tableau, on ne peut pas l'atteindre

		
		Chef abraracourcix=new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		
		Gaulois asterix=new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois=village.trouverHabitants(1);
		//System.out.println(gaulois);
		//L'indice 1 existe dans le tableau, mais il n'est pas initialisé, sa valeur est donc null, et gaulois est donc null
		Gaulois obelix=new Gaulois("Obelix",40);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();
		
		
	}
	
	
	
}
