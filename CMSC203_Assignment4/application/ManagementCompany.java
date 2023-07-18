/*
 * Class: CMSC203 
 * Instructor: Professor Farnaz
 * Description: (class that utilizes both property and plot class and creates a company)
 * Due: 07/17/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Remy Tran
*/

package application;

public class ManagementCompany {
	
	// maximum amount of properties set as 5
    public static final int MAX_PROPERTY = 5;
    
    // maximum width of plot is 10
    public static final int MGMT_WIDTH = 10;
    
    // maximum depth set as 10
    public static final int MGMT_DEPTH = 10;

    // private variables to store important data
    private String name;
    private String taxID;
    private double mgmFeePer;
    private Plot plot;
    private Property[] properties;
    private int numOfProperties;

    // Constructors
    
    // default constructor
    public ManagementCompany() {
        this("", "", 0);
    }

    // constructor to create object with specified name and taxID with default coordinates.
    public ManagementCompany(String name, String taxID, double mgmFeePer) {
        this(name, taxID, mgmFeePer, 0, 0, MGMT_WIDTH, MGMT_DEPTH);
    }

    // constructor creates object with user provided information and initializes the properties array and sets the starting number of properties to 0
    public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
        this.plot = new Plot(x, y, width, depth);
        this.properties = new Property[MAX_PROPERTY];
        this.numOfProperties = 0;
    }

    // this constructor creates a new object from already existing constructor however this time starting the count of properties.
    public ManagementCompany(ManagementCompany otherCompany) {
        this.name = otherCompany.name;
        this.taxID = otherCompany.taxID;
        this.mgmFeePer = otherCompany.mgmFeePer;
        this.plot = new Plot(otherCompany.plot);
        this.properties = new Property[MAX_PROPERTY];
        this.numOfProperties = otherCompany.numOfProperties;

        // Copy properties from otherCompany
        for (int i = 0; i < otherCompany.numOfProperties; i++) {
            this.properties[i] = new Property(otherCompany.properties[i]);
        }
    }

    // Methods
    // takes basic information as parameters and uses default coordinates and dimensions of the plot
    public int addProperty(String name, String city, double rent, String owner) {
        return addProperty(name, city, rent, owner, 0, 0, 1, 1);
    }

    // this second method takes full information of the property without any default info and creates an entirely new property with provided info
    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
        Property property = new Property(name, city, rent, owner, x, y, width, depth);
        return addProperty(property);
    }

    /* purpose of this third method is to ensure that the property being added does not conflict with an already existing property and validates
     * the data.
    */
    public int addProperty(Property property) {
        if (property == null) {
            return -2;
        }

        if (!plot.encompasses(property.getPlot())) {
            return -3;
        }

        for (int i = 0; i < numOfProperties; i++) {
            if (properties[i].getPlot().overlaps(property.getPlot())) {
                return -4;
            }
        }

        if (numOfProperties == MAX_PROPERTY) {
            return -1;
        }

        properties[numOfProperties] = property;
        numOfProperties++;
        return numOfProperties - 1;
    }

    // removes the last property within the array
    public void removeLastProperty() {
        if (numOfProperties > 0) {
            properties[numOfProperties - 1] = null;
            numOfProperties--;
        }
    }

    // this checks of the number of properties is going to exceed the maximum limit
    public boolean isPropertiesFull() {
        return numOfProperties == MAX_PROPERTY;
    }

    // returns total number of properties
    public int getPropertiesCount() {
        return numOfProperties;
    }

    // gets total rent by gathering number of properties and their assigned rent and adding them up
    public double getTotalRent() {
        double totalRent = 0;
        for (int i = 0; i < numOfProperties; i++) {
            totalRent += properties[i].getRentAmount();
        }
        return totalRent;
    }

    // compares which property has the highest rent and returns the info.
    public Property getHighestRentPropperty() {
    	
        if (numOfProperties == 0) {
            return null;
        }

        Property highestRentProperty = properties[0];
        for (int i = 1; i < numOfProperties; i++) {
            if (properties[i].getRentAmount() > highestRentProperty.getRentAmount()) {
                highestRentProperty = properties[i];
            }
        }
        return highestRentProperty;
    }

    // returns true if management fee is between 0 - 100.
    public boolean isManagementFeeValid() {
        return mgmFeePer >= 0 && mgmFeePer <= 100;
    }

    // Getters
    // returns the name of the company
    public String getName() {
        return name;
    }

    // returns the taxID
    public String getTaxID() {
        return taxID;
    }

    // returns the name of the property
    public Property[] getProperties() {
        return properties;
    }

    // returns the MGM fee
    public double getMgmFeePer() {
        return mgmFeePer;
    }

    // returns plot
    public Plot getPlot() {
        return plot;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("List of the properties for ").append(name).append(", taxID: ").append(taxID).append("\n\n");
        
        for (int x = 0; x < 30; x ++) {
        	result.append("_");
        }

        for (int i = 0; i < numOfProperties; i++) {
            result.append("\n").append(properties[i].toString());
        }
        
        result.append("\n");
        
        for (int x = 0; x < 30; x ++) {
        	result.append("_");
        }

        result.append("\n\nTotal management fee: ").append(calculateTotalMgmFee());

        return result.toString();
    }

  // returns total fee calculated.
    private double calculateTotalMgmFee() {
    	double totalRent = getTotalRent();
        return (totalRent * mgmFeePer) / 100.0;
    }
}
