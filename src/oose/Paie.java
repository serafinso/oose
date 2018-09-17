package oose;

public class Paie {

	public static void main(String[] args) {
		Commercial c1 = new Commercial("Dupont", 1000, 5000);
		Commercial c2 = new Commercial("M", 1000, 5000);
		Commercial c3 = new Commercial("John", 1000, 5000);
		Commercial c4 = new Commercial("D");
		c4.setInfosSalaire(2000, 8000);

		EmployeH e1 = new EmployeH("A", 40, 8, 0.5f);
		EmployeH e2 = new EmployeH("B", 40, 8, 0.3f);
		EmployeH e3 = new EmployeH("C");
		e3.setInfosSalaire(45, 8, 0.4f);

		Employe employes[] = { c1, c2, c3, c4, e1, e2, e3 };
		for (int i = 0; i < employes.length; i++) {
			System.out.println(employes[i].getNameE() + " gagne "
					+ employes[i].getSalaire() + " euros");
		}
		
		Directeur d = Directeur.createDirecteur("Dédé", 40);
		Directeur d1 = Directeur.createDirecteur("Arthur", 30); 
		
		//TEST DIRECTEUR SINGLETON
		System.out.println( d.getNameE());
		System.out.println( d.getSalaireFixe());
		System.out.println( d1.getNameE());
		System.out.println( d1.getSalaireFixe());
		
		//CALCUL SALAIRE DIRECTEUR
		float salaireD=0;
		salaireD = d.getSalaireFixe();
		float totalCA = 0;
		for (int i = 0; i < employes.length; i++) {
			if (employes[i] instanceof Commercial) {
				totalCA += employes[i].getChiffreA();
			}
		}
		salaireD += totalCA;
		System.out.println("Le salaire du directeur est de " + salaireD + " euros.");
		
		Entreprise E1 = new Entreprise(10, 2);
		//try {
		//		}
		
	}
}