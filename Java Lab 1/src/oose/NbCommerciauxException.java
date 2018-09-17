package oose;

public class NbCommerciauxException extends Exception{

	Entreprise entreprise; 
	
	public Entreprise getEntreprise() {
		return entreprise;
	}

	public NbCommerciauxException(String message, Entreprise entreprise) {
		super(message);
		this.entreprise = entreprise; 
	}

}
