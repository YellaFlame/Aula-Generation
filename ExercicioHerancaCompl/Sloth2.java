package ExercicioHeranca;

public class Sloth2 extends Animal2{

	public Sloth2() {
		super("Sloth");
	}	
		
		@Override
		public void Name(String nameAnimal) {
			System.out.println("\nName of the Sloth: "+nameAnimal);
		}
		
		@Override
		public void Age(int ageAnimal) {
			System.out.println("\nAge: "+ageAnimal);
		}
		
		@Override
		public void Sound(String soundAnimal) {
			System.out.println("\nThis animal sounds like: "+soundAnimal);
		}
		
		public void Climb() {
			System.out.println("\nThe Sloth can climb");
	}
}

