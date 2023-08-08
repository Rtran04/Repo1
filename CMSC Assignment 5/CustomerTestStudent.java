import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTestStudent {
    private Customer customer;

    @BeforeEach
    public void setUp() {
        // Initialize a sample Customer object before each test
        customer = new Customer("John Doe", 30);
    }

    @Test
    public void testGetAge() {
        Assertions.assertEquals(30, customer.getAge());
    }

    @Test
    public void testSetAge() {
        customer.setAge(35);
        Assertions.assertEquals(35, customer.getAge());
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals("John Doe", customer.getName());
    }

    @Test
    public void testSetName() {
        customer.setName("Jane Smith");
        Assertions.assertEquals("Jane Smith", customer.getName());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("John Doe, 30y/o", customer.toString());
    }

    @Test
    public void testCopyConstructor() {
        Customer copiedCustomer = new Customer(customer);
        Assertions.assertEquals(customer.getName(), copiedCustomer.getName());
        Assertions.assertEquals(customer.getAge(), copiedCustomer.getAge());
    }
}
