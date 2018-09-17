package oose;

public class Directeur extends Employe{
	
	private static Directeur leDirecteur;
	private float salaireFixe;
	
	private Directeur(String nameE, float salaireFixe) {
		super(nameE);
		this.salaireFixe = salaireFixe; 
	}
	
	public static Directeur createDirecteur(String name, float ca ) {
		if (leDirecteur == null) {
			leDirecteur = new Directeur(name,ca); 
		}
		return leDirecteur; 
	}

	public float getSalaire() {
		return this.salaireFixe;
	}

	
	//GETTER & SETTER 
	
	public float getSalaireFixe() {
		return this.salaireFixe;
	}

	public void setSalireFixe(float salaireFixe) {
		this.salaireFixe = salaireFixe;
	}

}
