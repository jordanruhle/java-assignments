
public class Item {
	
//	Variables and Attributes
	private String name;
	private double price;
	
	
	
//	Constructors
	public Item() {
		this("coffee", 3.50);
	}
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
//	Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
