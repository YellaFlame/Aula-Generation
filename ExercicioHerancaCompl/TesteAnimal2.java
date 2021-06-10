package ExercicioHeranca;

import java.util.Scanner;
public class TesteAnimal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
		Dog2 dog = new Dog2();
		Horse2 horse = new Horse2();
		Sloth2 sloth = new Sloth2();
		
		
		Animal2 animal = null;
		
		int x;
		do {
			System.out.println("\nWhats your animal type?\n\n1-Dog\n2-Horse\n3-Sloth");
			x = read.nextInt();
			if(x==1) {
				animal=dog;
				System.out.println("\nWhats your dog name?");
				String name = read.next();
				System.out.println("\nWhats your dog age?");
				int age = read.nextInt();
				System.out.println("\nThis is cool, what the sound your dog emits?");
				String sound = read.next();
				System.out.println("---------------------------------------------------------------");
				dog.Name(name);
				dog.Age(age);
				dog.Sound(sound);
				dog.Run();
				
			}
			else if (x==2) {
				animal=horse;
				System.out.println("\nWhats your horse name?");
				String name = read.next();
				System.out.println("\nWhats your horse age?");
				int age = read.nextInt();
				System.out.println("\nThis is cool, what the sound your horse emits?");
				String sound = read.next();
				System.out.println("---------------------------------------------------------------");
				horse.Name(name);
				horse.Age(age);
				horse.Sound(sound);
				horse.Run();
			}
			else if (x==3) {
				animal=sloth;
				System.out.println("\nWhats your sloth name?");
				String name = read.next();
				System.out.println("\nWhats your sloth age?");
				int age = read.nextInt();
				System.out.println("\nThis is cool, what the sound your sloth emits?");
				String sound = read.next();
				System.out.println("---------------------------------------------------------------");
				sloth.Name(name);
				sloth.Age(age);
				sloth.Sound(sound);
				sloth.Climb();
			}
			else {
				System.out.println("\nPlease choose a valid option");
			}
		}
		while(x<=0 || x>=4);
	}
}
