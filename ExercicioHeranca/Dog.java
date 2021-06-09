package ExercicioHeranca;

public class Dog extends Animal{

	
	private String breed;
	
	public Dog(String name, int age, String breed ) {
		
		super(name,age);
		this.breed = breed;
		
	}
	public void printInfo() {
		System.out.println("\n-----Caracteristics of the animal------ "+
	"\nSpecies: "+breed+"\nName: "+getName()+"\nAge: "+getAge());
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
