package ExercicioHeranca;

public class Horse2 extends Animal2 {

	public Horse2() {
		super("Horse");
		}
	
	@Override
	public void Name(String nameAnimal) {
		System.out.println("\nName of the Horse: "+nameAnimal);
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
		System.out.println("\nThe Horse can throotle");
	}
}
