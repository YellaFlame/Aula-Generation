package ClasseObjetoAtividade;

public class Airplane {
	
	private String model;
	private String company;
	private int price;
	private int occupation;
	
	public Airplane(String model,String company, int price, int occupation) {
		
		this.model = model;
		this.company = company;
		this.occupation = occupation;
		this.price = price;
	}
	public void printInfo() {
		System.out.println("Airplane model: "+model+"\nCompany: "+company
				+ "\nOccupation of: " +occupation+ " passengers"+ "\nPrice $: "+price);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setType(String type) {
		this.price = price;
	}
	public int getOccupation() {
		return occupation;
	}
	public void setOccupation(int occupation) {
		this.occupation = occupation;
	}

}
