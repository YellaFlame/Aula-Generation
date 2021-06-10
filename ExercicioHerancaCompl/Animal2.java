package ExercicioHeranca;

public abstract class Animal2 {

	private String typeAnimal;
	abstract public void Name(String nameAnimal);
	abstract public void Age(int ageAnimal);
	abstract public void Sound(String soundAnimal);
	
	public Animal2(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	
	public String getTypeanimal() {
		return typeAnimal;
	}
	
	public void setTypeanimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	
}
