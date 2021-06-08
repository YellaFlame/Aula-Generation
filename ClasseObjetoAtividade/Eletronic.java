package ClasseObjetoAtividade;

public class Eletronic {
	
	private String model;
	private int price;
	
	public Eletronic(String model, int price) {
		
		this.model = model;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("\nModel: "+model+"\nPrice: "+price);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
