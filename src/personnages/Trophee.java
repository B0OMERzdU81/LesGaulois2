package personnages;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	public Trophee(Gaulois gaulois, Equipement equipement) {
		super();
		this.gaulois = gaulois;
		this.equipement = equipement;
	}
	
	public Equipement getEquipement() {
		return equipement;
	}
	public Gaulois getGaulois() {
		return gaulois;
	}
}
