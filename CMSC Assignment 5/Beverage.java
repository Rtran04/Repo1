/*
 * Class: CMSC203 40398
 * Instructor:
 * Description: (main abstract super class)
 * Due: 08/07/2023
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Remy Tran
*/
public abstract class Beverage {

	 private String name;
	    private Type type;
	    private Size size;
	    private final double BASE_PRICE = 2.0;
	    private final double SIZE_PRICE = 1.0;
	    
	 public Beverage(String bevName, Type bevType, Size bevSize) {
         name = bevName;
         type = bevType;
         size = bevSize;
    }
	 public double getBasePrice() {
	        return BASE_PRICE;
	}
	 public Type getType() {
	        return type;
	}
	 public String getBevName() {
	        return name;
	}
	 public Size getSize() {
	     return size;
	}
	 public double addSizePrice() {
	        return SIZE_PRICE;
	}
	 public void setName(String bevName) {
	        name = bevName;
	}
	public void setType(Type bevType) {
	        type  = bevType;
	}
	public void setSize(Size bevSize) {
	        size = bevSize;
	}  
	 public abstract double calcPrice();
	    public String toString() {
	            return name +", " +size;
	    }
	    public boolean equals(Beverage bev) {
	            if (name.equals(bev.getBevName()) && type==bev.getType() && size==bev.getSize()) {
	                    return true;
	            }
	            else {
	                    return false;
	            }
	    }
}

