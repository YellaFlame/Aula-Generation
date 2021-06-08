package ClasseObjetoAtividade;

public class ObjectEletronic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eletronic phone1 = new Eletronic("Moto X",500);
		Eletronic phone2 = new Eletronic("Iphone 6s",900);
		Eletronic phone3 = new Eletronic("Moto E6",1000);
		Eletronic phone4 = new Eletronic("Galaxy S7",800);
		Eletronic phone5 = new Eletronic("Xiaomi mi4",500);
		Client client1 = new Client("Leonardo",23,"935654879","R.Jose Fernandes Filho");
		
		
		System.out.println("\n-------Phones in Stock-------");
		phone1.printInfo();
		phone2.printInfo();
		phone3.printInfo();
		phone4.printInfo();
		phone5.printInfo();
		
		System.out.println("\n____________________________________");
		System.out.println("\n-----Solds on internet----- ");
		phone1.printInfo();
		phone2.printInfo();
		
		System.out.println("\n____________________________________");
		System.out.println("\nSend the sold Phones to client below and update the Stock: ");
		client1.printInfo();
		
		System.out.println("\n____________________________________");
		System.out.println("\n-------Phones in Stock-------");
		phone3.printInfo();
		phone4.printInfo();
		phone5.printInfo();
	}
}
