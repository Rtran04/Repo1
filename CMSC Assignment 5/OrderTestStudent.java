import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class OrderTestStudent {

    @Test
    public void testGenOrderNum() {
        // Test the genOrderNum() method to generate a random order number
        Order order = new Order(12, Day.MONDAY, new Customer("John Doe", 25));
        int orderNo1 = order.genOrderNum();
        int orderNo2 = order.genOrderNum();

        Assertions.assertNotEquals(orderNo1, orderNo2);
    }

    @Test
    public void testAddNewBeverage() {
        // Test the addNewBeverage() method to add beverages to the order
        Order order = new Order(12, Day.MONDAY, new Customer("John Doe", 25));
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);
        order.addNewBeverage("Smoothie", Size.SMALL, 3, true);

        ArrayList<Beverage> beverages = order.getBeverages();
        Assertions.assertEquals(2, beverages.size());
        Assertions.assertTrue(beverages.get(0) instanceof Coffee);
        Assertions.assertTrue(beverages.get(1) instanceof Smoothie);
    }


    @Test
    public void testFindNumOfBeveType() {
        // Test the findNumOfBeveType() method to find the number of beverages of a specific type
        Order order = new Order(12, Day.MONDAY, new Customer("John Doe", 25));
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);
        order.addNewBeverage("Smoothie", Size.SMALL, 3, true);
        order.addNewBeverage("Martini", Size.LARGE);

        int numCoffees = order.findNumOfBeveType(Type.COFFEE);
        int numSmoothies = order.findNumOfBeveType(Type.SMOOTHIE);
        int numAlcohols = order.findNumOfBeveType(Type.ALCOHOL);

        Assertions.assertEquals(1, numCoffees);
        Assertions.assertEquals(1, numSmoothies);
        Assertions.assertEquals(1, numAlcohols);
    }

    
}
