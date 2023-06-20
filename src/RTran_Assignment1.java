/*
 * Class: CMSC203 
 * Instructor: Professor Farnaz
 * Description: (Give a brief description for each Class)
 * Due: 6/19/2023
 * Platform/compiler: vscode
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Remy Tran
*/


import java.util.Scanner;
import java.util.Random; 

public class RTran_Assignment1 {
    



    public static int mainGame(int a){
        // scanner declared
        Scanner scanner = new Scanner(System.in);
        // random number generator declared
        Random rand = new Random();
        // initializing and declaring color value
        int color = rand.nextInt(5);
        // string to hold the name of color
        String correctColor = "no color.";

        int guess;
        int score = 0;
        // loop that runs 10 times and displays round number
        int rounds;
        for(rounds = 1; rounds < 11; rounds++){
            System.out.print("\nRound " + rounds + "\n");
            System.out.print("\nI am thinking of a color.\nIs it Red, Green, Blue, Orange, or Yellow?\nEnter your guess here: ");
            guess = scanner.nextInt();
            
            if(guess == color){
                score++;
            }

           
            // assigns color to number
            switch(color) {
                case 0:
                correctColor = "Red.";
                break;
                case 1:
                correctColor = "Green.";
                break;
                case 2:
                correctColor = "Blue.";
                break;
                case 3:
                correctColor = "Orange.";
                break;
                case 4: 
                correctColor = "Yellow.";
                break;
             }
            // rerandomizing 
            color = rand.nextInt(5);
            System.out.print("\nI was thinking of " + correctColor);
       
        }
        scanner.close();

        return score;
    }


    public static void main(String[] args) {
        // user input variables
        String userName, selfDescribe;
        int mcNum;



        // scanner
        Scanner input = new Scanner(System.in);

        // introduction prompt
        System.out.print("Enter your name: ");
        userName = input.nextLine();

        System.out.print("\nEnter your MC M#: M");
        mcNum = input.nextInt();
        input.nextLine();

        System.out.print("\nDescribe yourself:");
        selfDescribe = input.nextLine();

        System.out.print("\nDue Date: 06/20/23");
        System.out.print("\nCMSC203 Assignment1: Test your ESP Skills!");

        // get final score from mainGame method 
        int result = mainGame(1);
        
        // final display
        System.out.println("\nYou guessed " + result + " out of 10 colors correctly.");
        System.out.print("User Name: " + userName + "\nStudent MC M#: M" + mcNum + "\nUser Description: " + selfDescribe + "\nDue Date: 06/20/23\n\n");
        
        input.close();
    }
}
