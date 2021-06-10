package ExercicioHeranca;

public class Dog2 extends Animal2{
	
	public Dog2() {
		super("Dog");
		}
	
	@Override
	public void Name(String nameAnimal) {
		System.out.println("\nName of the Dog: "+nameAnimal);
	}
	
	@Override
	public void Age(int ageAnimal) {
		System.out.println("\nAge: "+ageAnimal);
	}
	
	@Override
	public void Sound(String soundAnimal) {
		System.out.println("\nThis animal sounds like: "+soundAnimal);
	}
	
	public void Run() {
		System.out.println("\nThe Dog can run");
	}
}
