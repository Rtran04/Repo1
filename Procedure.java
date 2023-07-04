/*
 * Class: CMSC203 
 * Instructor: Professor Farnaz
 * Description: (Assignment 2 patient and procedure class)
 * Due: 07/03/2023
 * Platform/compiler: Visual studio & eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Remy Tran
*/

public class Procedure {
  
    // date for procedure
     private String procedureName;
    private String date;
    private String practitioner;
    private double charge;

    // Constructor that takes data as input and sets them
    public Procedure(String procedureName, String date, String practitioner, double charge) {
        this.procedureName = procedureName;
        this.date = date;
        this.practitioner = practitioner;
        this.charge = charge;
    }

    //returns procedure name
    public String getProcedureName() {
        return procedureName;
    }

    // sets procedure name
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    // returns date
    public String getDate() {
        return date;
    }

    // sets date
    public void setDate(String date) {
        this.date = date;
    }

    // returns practitioner name
    public String getPractitioner() {
        return practitioner;
    }

    // sets practitioner name
    public void setPractitioner(String practitioner) {
        this.practitioner = practitioner;
    }

    // returns patient's charge
    public double getCharge() {
        return charge;
    }

    // sets patient's charge
    public void setCharge(double charge) {
        this.charge = charge;
    }

    // returns string with procedure information.
    @Override
    public String toString() {
        return "Procedure: " + this.procedureName +
               "\nProcedure Date: " + this.date +
               "\nPractitioner: " + this.practitioner +
               "\nProcedure Charge: " + this.charge;
    }


}
