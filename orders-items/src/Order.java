import java.util.ArrayList;

public class Order {
	
	private String name;
	private double total;
	private boolean ready;
	ArrayList<Item> items;
	
//	Constructors
	public Order() {
		this("Customer", false, new ArrayList<Item>());
	}
	
	public Order(String name, boolean ready, ArrayList<Item> items) {
		this.name = name;
		this.total = calculateTotal(items);
		this.ready = ready;
		this.items = items;
		
	}
	
//	Methods 
	
	public double calculateTotal(ArrayList<Item> items) {
		double total = 0;
		for(int i = 0; i < items.size(); i++) {
			total += items.get(i).getPrice();
		}
		return total;
	}
	
	public void updateOrder(ArrayList<Item> items) {
		for(int i = 0; i < items.size(); i++) {
			total += items.get(i).getPrice();
			items.add(items.get(i));
		}
	}
	
	public void updateOrder(Item item) {
		total += item.getPrice();
		items.add(item);
	}
	
	
//	Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

	public boolean isReady() {
		return ready;
	}
	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	


}
