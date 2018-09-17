package oose;

public class Entreprise {
	
	String name;
	

	int nbEmployeMax;
	private int nbCommerciauxMax;
	
	Employe tabEmploye[] = new Employe[nbEmployeMax];
	private int nbEmploye = 0;
	private int nbCommerciaux = 0;
	
	

	public Entreprise(int nbEmployeMax, int nbCommerciauxMax) {
		this.nbEmployeMax = nbEmployeMax;
		this.nbCommerciauxMax = nbCommerciauxMax;
	}


	
	public void addEmploye (Employe newE) throws NbCommerciauxException{
		if (newE instanceof Commercial){
			if(nbCommerciaux == nbCommerciauxMax){
				throw new NbCommerciauxException ("Trop de Commerciaux", this);
				}
		}
	}
	
	//GETTER AND SETTER 
	
	public int getNbEmploye() {
		return nbEmploye;
	}

	public void setNbEmploye(int nbEmploye) {
		this.nbEmploye = nbEmploye;
	}

	public int getNbCommerciaux() {
		return nbCommerciaux;
	}

	public void setNbCommerciaux(int nbCommerciaux) {
		this.nbCommerciaux = nbCommerciaux;
	}

	public int getNbCommerciauxMax() {
		return nbCommerciauxMax;
	}

	public void setNbCommerciauxMax(int nbCommerciauxMax) {
		this.nbCommerciauxMax = nbCommerciauxMax;
	}
	
	public String getName() {
		return name;
	}
	
}
