/*
 * Class: CMSC203 40398
 * Instructor:
 * Description: (processes orders)
 * Due: 08/07/2023
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Remy Tran
*/
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Order implements OrderInterface, Comparable<Order> {
    private int orderNo;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private ArrayList<Beverage> beverages;

    public Order(int orderTime, Day orderDay, Customer cust) {
        this.orderNo = genOrderNum();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = cust;
        this.beverages = new ArrayList<>();
    }

    public int genOrderNum() {
        return ThreadLocalRandom.current().nextInt(10000, 90000);
    }

    // Implement OrderInterface methods here (if applicable)

    public int getOrderNo() {
        return orderNo;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public Day getOrderDay() {
        return orderDay;
    }

    public Customer getCustomer() {
        return new Customer(customer);
    }

    public ArrayList<Beverage> getBeverages() {
        return beverages;
    }

    public boolean isWeekend() {
        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
    }

    public Beverage getBeverage(int itemNum) {
        return beverages.get(itemNum);
    }

    public int getTotalItems() {
        return beverages.size();
    }

    public void addNewBeverage(String name, Size size, boolean extraShot, boolean extraSyrup) {
        Coffee c = new Coffee(name, size, extraShot, extraSyrup);
        beverages.add(c);
    }

    public void addNewBeverage(String name, Size size, int numOfFruits, boolean proteinPowder) {
        Smoothie s = new Smoothie(name, size, numOfFruits, proteinPowder);
        beverages.add(s);
    }

    public void addNewBeverage(String name, Size size) {
        boolean isWeekend = isWeekend();
        Alcohol a = new Alcohol(name, size, isWeekend);
        beverages.add(a);
    }

    public double calcOrderTotal() {
        double orderTotal = 0;

        for (Beverage b : beverages) {
            orderTotal += b.calcPrice();
        }

        return orderTotal;
    }

    public int findNumOfBeveType(Type type) {
        int count = 0;

        for (Beverage b : beverages) {
            if (b.getType() == type) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("__________________________________\n");
        s.append(orderDay).append(", ").append(orderTime).append("\n").append(customer).append(" Order Num: ")
                .append(orderNo);

        for (Beverage b : beverages) {
            s.append("\n").append(b);
        }

        s.append("\n Order Total: ").append(calcOrderTotal()).append("\n");
        return s.toString();
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(orderNo, o.getOrderNo());
    }
}
