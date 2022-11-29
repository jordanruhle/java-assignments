import java.util.ArrayList;
public class CafeUtil {

    public CafeUtil(){
        System.out.println("CafeUtil created");
    }

    public int getStreakGoal(){
        int drinkCount = 0;
        for(int i = 1; i<=10; i++){
            drinkCount += i;
        }
        return drinkCount;
    }

    public double getOrderTotal(double[] prices){
        double orderTotal = 0.0;
        for(double price : prices){
            orderTotal += price;
        }
        return orderTotal;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " in front of you");
        customers.add(userName);
        System.out.println(customers);

    }


}