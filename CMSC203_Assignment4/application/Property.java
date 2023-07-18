/*
 * Class: CMSC203 
 * Instructor: Professor Farnaz
 * Description: (property class which manages the name and information belonging to a certain plot )
 * Due: 07/17/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Remy Tran
*/

package application;

public class Property {
	
	// private variables 
    private String propertyName;
    private String city;
    private double rentAmount;
    private String owner;
    private Plot plot;

    // Constructors
    // default property constructor
    public Property() {
        this("", "", 0, "");
    }

    // creates property object with default coordinates
    public Property(String propertyName, String city, double rentAmount, String owner) {
        this(propertyName, city, rentAmount, owner, 0, 0, 1, 1);
    }

    // creates property with all user provided information and initializes the size of the plot
    public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);
    }

    // creates new copy of property object
    public Property(Property otherProperty) {
        this.propertyName = otherProperty.propertyName;
        this.city = otherProperty.city;
        this.rentAmount = otherProperty.rentAmount;
        this.owner = otherProperty.owner;
        this.plot = new Plot(otherProperty.plot);
    }

    // Getters
    // returns the plot
    public Plot getPlot() {
        return plot;
    }

    // returns name of property
    public String getPropertyName() {
        return propertyName;
    }

    // returns name of city
    public String getCity() {
        return city;
    }

    // returns price of rent.
    public double getRentAmount() {
        return rentAmount;
    }

    // returns name of owner.
    public String getOwner() {
        return owner;
    }

    // toString method
    @Override
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentAmount;
    }
}

