package oose;

public class EmployeH extends Employe {

	float nbH;
	float tauxH;
	float tauxHS;

	public EmployeH(String nameE) {
		super(nameE);
	}

	public EmployeH(String nameE, float nbH, float tauxH, float tauxHS) {
		super(nameE);
		this.nbH = nbH;
		this.tauxH = tauxH;
		this.tauxHS = tauxHS;
	}

	public void setInfosSalaire(float nbH, float tauxH, float tauxHS) {
		this.nbH = nbH;
		this.tauxH = tauxH;
		this.tauxHS = tauxHS;

	}

	public float getSalaire() {
		float salaire;
		if (nbH < 35) {
			salaire = nbH * tauxH;
		} else {
			salaire = (nbH * tauxH + (nbH - 35) * tauxHS);
		}
		return salaire;
	}
}