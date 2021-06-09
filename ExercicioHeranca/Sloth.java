package ExercicioHeranca;

public class Sloth extends Animal{

	private String breed;
	
	public Sloth(String name, int age, String breed) {
		
		super(name,age);
		this.breed = breed;
		
	}

	public void printInfo() {
		System.out.println("\n-----Caracteristics of the animal------ "+"\nSpecies: "+breed+
	"\nName: "+getName()+"\nAge: "+getAge());
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}

