package ExercicioHeranca;

public class Horse extends Animal{

	private String breed;
	
	
	public Horse(String name, int age, String breed) {
		
		super(name,age);
		this.breed = breed;
	}

	public void printInfo() {
		System.out.println("\n-----Caracteristics of the animal------ "+"\nSpecies: "+breed+
	"\nName: "+getName()+"\nAge: "+getAge());

	}
}

