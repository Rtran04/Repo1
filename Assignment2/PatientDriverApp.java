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

import java.util.Scanner;


public class PatientDriverApp {
    
    public static void main(String[] args){

        // constant variables
        final String STUDENT_NAME = "Remy Tran";
        final String MC_ID = "M21122632";
        final String DUE_DATE = "07/03/2023";

        // data needed to input into patient class.
        String firName, lasName, midName, address, city, state, emerName, emerNum, phoneNum, date;
        int zipCode;

        Scanner input = new Scanner(System.in);

        // displaying user to input information and storing data
        System.out.print("Enter your first name: ");
        firName = input.nextLine();
        System.out.print("Enter your middle name: ");
        midName = input.nextLine();
        System.out.print("Enter your last name: ");
        lasName = input.nextLine();
        System.out.print("Enter your address: ");
        address = input.nextLine();
        System.out.print("Enter your city: ");
        city = input.nextLine();
        System.out.print("Enter your state: ");
        state = input.nextLine();
        System.out.print("Enter your zipcode: ");
        zipCode = input.nextInt();
        input.nextLine();
        System.out.print("Enter your phone number: ");
        phoneNum = input.nextLine();
        System.out.print("Enter your emergency contact name: ");
        emerName = input.nextLine();
        System.out.print("Enter your emergency contact phone number: ");
        emerNum = input.nextLine();
        System.out.print("Enter todays date: ");
        date = input.nextLine();

        // takes user inputted data and creates new patient with given info
        Patient currentPatient = new Patient(firName, midName, lasName, address, city, state, zipCode, phoneNum, emerName, emerNum);

        // provided info input into procedure classes
        Procedure procedure1 = new Procedure("Physical Exam", date, "Dr Irvine", 250.00);
        Procedure procedure2 = new Procedure("X-Ray", date, "Dr.Jamison", 500.00);
        Procedure procedure3 = new Procedure("Blood test", date, "Dr.Smith", 200.00);

        System.out.println("\n\n" + currentPatient.toString());
        System.out.println("\n" + procedure1.toString());
        System.out.println("\n" + procedure2.toString());
        System.out.println("\n" + procedure3.toString());

        input.close();
      
        System.out.println("\n\nStudent name: " + STUDENT_NAME + "\nStudent MC M#: " + MC_ID + "\nDue Date: " + DUE_DATE);

    }

}

