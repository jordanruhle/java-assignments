
import java.util.ArrayList;
public class OrderTest {

	public static void main(String[] args) {

		
		// Menu items
		Item item1 = new Item("mocha", 5.0);
		Item item2 = new Item("latte", 4.0);
		Item item3 = new Item("drip", 2.0);
		Item item4 = new Item("capuccino", 3.0);
		
		ArrayList<Item> orderOneList = new ArrayList<Item>();
		orderOneList.add(item1);
		
		ArrayList<Item> orderTwoList = new ArrayList<Item>();
		orderTwoList.add(item2);
		orderTwoList.add(item3);
		orderTwoList.add(item4);
		
		ArrayList<Item> orderThreeList = new ArrayList<Item>();
		orderThreeList.add(item3);
		
		ArrayList<Item> orderFourList = new ArrayList<Item>();
		orderFourList.add(item4);
		
		// Order variables -- order1, order2 etc.
		Order order1 = new Order("Cindhuri", false, orderOneList);
		Order order2 = new Order("Jimmy", false, orderTwoList);
		Order order3 = new Order("Noah", false, orderThreeList);
		Order order4 = new Order("Sam", false, orderFourList);
		
		System.out.println(order1.getTotal());
		System.out.println(order2.getTotal());
		
		System.out.println(order3.getTotal());
		order3.updateOrder(item4);
		System.out.println(order3.getTotal());
		
		
		ArrayList<Item> orderFourUpdate = new ArrayList<Item>();
		orderFourUpdate.add(item2);
		orderFourUpdate.add(item2);
		
		orderFourList.add(item4);
		System.out.println(order4.getTotal());
		order4.updateOrder(item2);
		System.out.println(order4.getTotal());
		System.out.println(order4.getItems());
		order4.updateOrder(orderFourUpdate);
		System.out.println(order4.getTotal());
		System.out.println(order4.getItems());
		
		order2.setReady(true);
		System.out.println(order2.isReady());
    
        // Application Simulations
        // Use this example code to test various orders' updates
//        System.out.printf("Name: %s\n", order1.name);
//        System.out.printf("Total: %s\n", order1.total);
//        System.out.printf("Ready: %s\n", order1.ready);
	}

}
