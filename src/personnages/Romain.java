package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
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
		force-=forceCoup;
		if(force>0) {
			parler("Aie");
		}
		else {
			parler("J'abandonne");
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Romain jaximus = new Romain ("Jaximus", 5);
		jaximus.prendreParole();
		jaximus.parler("Je n'aime pas me faire frapper");
		jaximus.recevoirCoup(1);
	}

}
