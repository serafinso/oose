package oose;

public class Commercial extends Employe {

	private float chiffreA;
	private float salaireFixe;

	public Commercial(String nameE) {
		super(nameE);
	}

	public Commercial(String nameE, float chiffreA, float salaireFixe) {
		super(nameE);
		this.chiffreA = chiffreA;
		this.salaireFixe = salaireFixe;
	}

	public void setInfosSalaire(float chiffreA, float salaireFixe) {
		this.chiffreA = chiffreA;
		this.salaireFixe = salaireFixe;

	}

	public float getSalaire() {
		return (float) (this.salaireFixe + (0.01 * this.chiffreA));
	}

	public float getChiffreA() {
		return (float)(this.chiffreA);
	}
}