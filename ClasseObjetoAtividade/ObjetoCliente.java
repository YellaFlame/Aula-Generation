package ClasseObjetoAtividade;

public class ObjetoCliente {
	
	public static void main(String[] args) {

	Client client1 = new Client("Leonardo",23,"935654879","R.Jose Fernandes Filho");
	Client client2 = new Client("Bernardo",15,"996312547","R. Jose Fernandes Filho");

	System.out.println("\n----------Client list----------");
	client1.printInfo();
	client2.printInfo();
	
	System.out.println("\nClient Leonardo requested a phone change");
	client1.setPhone("935654312");
	System.out.print("\n-----------Phone Change-----------");
	client1.printInfo();
	
	System.out.println("\n----------Client list----------");
	client1.printInfo();
	client2.printInfo();
 }
}
