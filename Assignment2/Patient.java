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


/*Patient class, represents patient object */

public class Patient {
    
    // patient's personal info
    private String fName, mName, lName, adress, city, state, phoneNum;
    private int zipCode;
    
    //emergency info
    private String emergencyName, emergencyNum;
    

    /* 
    * Copy Constructor 
    */
    public Patient( Patient p){
        fName = p.fName;
        mName = p.mName;
        lName = p.lName;
        adress = p.adress;
        city = p.city;
        state = p.state;
        phoneNum = p.phoneNum;
        zipCode = p.zipCode;
        emergencyName = p.emergencyName;
        emergencyNum = p.emergencyNum;
    }

    /* Constructor that takes patient data and sets them 
    */
    public Patient(String fName, String mName, String lName, String adress, String city, String state, int zipCode, String phoneNum, String emergencyName, String emergencyNum){

        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.adress = adress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNum = phoneNum;
        this.emergencyName = emergencyName;
        this.emergencyNum = emergencyNum;

    }


    // sets patient's first nanme
    public void setFName(String fName){
        this.fName = fName;
    }

    // returns patient's first name
    public String getFName(){
        return fName;
    }

    // sets patient's middle name
    public void setMName(String mName){
        this.mName = mName;
    }

    // returns patient's middle name
    public String getMName(){
        return mName;
    }

    // sets patient's last name
    public void setLName(String lName){
        this.lName = lName;
    }

    // returns patient's last name
    public String getLName(){
        return lName;
    }

    //sets patient's adress
    public void setAdress(String adress){
        this.adress = adress;
    }

    // returns patient's adress
    public String getAdress(){
        return adress;
    }

    // sets patient's city
    public void setCity (String city){
        this.city = city;
    }

    // returns patient's city
    public String getCity(){
        return city;
    }

    // sets patient's state
    public void setState(String state){
        this.state = state;
    }

    // returns patient's state
    public String getState(){
        return state;
    }

    // set patient's zipcode
    public void setZip(int zipCode){
        this.zipCode = zipCode;
    }

    // returns patient's zipcode
    public int getZip(){
        return zipCode;
    }

    // sets patient's phone number
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }

    // returns patient's phone number
    public String getPhoneNum(){
        return phoneNum;
    }

    // sets patient's emergency contact name
    public void setEmergencyName(String emergencyName){
        this.emergencyName = emergencyName;
    }

    // returns patient's emergency contact name
    public String getEmergencyName(){
        return emergencyName;
    }

    // sets emergency contact number
    public void setEmergencyNum(String emergencyNum){
        this.emergencyNum = emergencyNum;
    }

    // returns emergency contact number
    public String getEmergencyNum(){
        return emergencyNum;
    }


    /*Returns a String with patient's information */

    @Override
    public String toString(){
        return "Patient name: " + this.fName + "\nAdress: " + this.adress + "\nCity: " + this.city + "\nState: " + this.state + "\nZIP: " + this.zipCode +
            "\nEmergency Contact: " + this.emergencyName + " " + this.emergencyNum;
    }









}
