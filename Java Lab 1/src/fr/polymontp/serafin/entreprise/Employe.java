package fr.polymontp.serafin.entreprise;

public abstract class Employe {

	protected String nameE;

	public Employe(String nameE) {
		this.nameE = nameE;
	}

	public String getNameE() {
		return nameE;
	}

	public void setNameE(String nameE) {
		this.nameE = nameE;
	}

	abstract public float getSalaire();
}