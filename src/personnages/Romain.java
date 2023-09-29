package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		assert force>0 : "La force du romain est inférieur à 1";
		this.nom=nom;
		this.force=force;
	
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
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain jaximus = new Romain ("Jaximus", 5);
		Romain minus = new Romain ("Minus", 6);
		jaximus.prendreParole();
		jaximus.parler("Je n'aime pas me faire frapper");
		jaximus.recevoirCoup(1);
	}

}
