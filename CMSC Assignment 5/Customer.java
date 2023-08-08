/*
 * Class: CMSC203 40398
 * Instructor:
 * Description: (manages customer info)
 * Due: 08/07/2023
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Remy Tran
*/
public class Customer extends Object {
    private String name;
    private int age;
    
    public Customer(Customer c) {
        name = c.getName();
        age = c.getAge();
}
    
    public Customer(String name, int age) {
            this.name = name;
            this.age= age;
    }
    
    public int getAge() {
        return age;
}
    public void setAge(int age) {
        this.age = age;
}    
    public String getName() {
        return name;
} 
    public void setName(String name) {
        this.name = name;
} 
    public String toString() {
            return name +", " +age +"y/o";
    }
}

