package ExercicioHeranca;

public class TesteAnimal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog cachorro = new Dog("Chico",51, "Pastor Alemao");
		Horse cavalo = new Horse("Bento",25,"Listrado");
		Sloth preguica = new Sloth("Josue",10,"De olho preto");
		
		cavalo.printInfo();
		preguica.printInfo();
		cachorro.printInfo();
	}
}
