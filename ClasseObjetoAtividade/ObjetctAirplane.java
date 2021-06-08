package ClasseObjetoAtividade;

public class ObjetctAirplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Airplane air1 = new Airplane("Boing 777"," GOL", 500000, 98);
		Airplane air2 = new Airplane("Cask 765"," Emirates", 400000, 50);
		Airplane air3 = new Airplane("FH-37"," London", 950000, 6);
		
		System.out.println("\n---------List of Avaiables Airplanes to buy---------");
		System.out.println("\n1st Option");
		air1.printInfo();
		System.out.println("\n2nd Option");
		air2.printInfo();
		System.out.println("\n3rd Option");
		air3.printInfo();
	}

}
