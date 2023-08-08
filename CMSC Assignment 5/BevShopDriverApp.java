/*
 * Class: CMSC203 40398
 * Instructor:
 * Description: (main driver to place order)
 * Due: 08/07/2023
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Remy Tran
*/

import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BevShop bevShop = new BevShop();

        System.out.println("The current order in process can have at most " + bevShop.getMaxOrderForAlcohol() + " alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is " + bevShop.getMinAgeForAlcohol());
        System.out.println("Start please a new order:\n"
        				+"Your Total Order for now is 0.0 ");
        

        while (true) {
            System.out.print("Would you please enter your name: ");
            String customerName = input.nextLine();

            System.out.print("Would you please enter your age: ");
            int customerAge = Integer.parseInt(input.nextLine());

            if (customerAge >= bevShop.getMinAgeForAlcohol()) {
                System.out.println("Your age is above " + (bevShop.getMinAgeForAlcohol() - 1) + " and you are eligible to order alcohol.");
            } else {
                System.out.println("Your age is not appropriate for alcohol drink!!");
            }

            bevShop.startNewOrder(12, Day.MONDAY, customerName, customerAge);

            boolean continueOrder = true;
            while (continueOrder) {
            	
                

            	System.out.println("Would you please add a beverage?\n"
            					+ "1. Alcohol\n"
            					+ "2. COFFEE\n"
            					+ "3. SMOOTHIE\n"
            					+ "4. Finish Order");


                int choice = Integer.parseInt(input.nextLine());
                
                String bevName;
                Size bevSize;

                if (choice == 1) {
                	if (customerAge <= (bevShop.getMinAgeForAlcohol()) - 1) {
                		System.out.println("Age not appriopriate for alcohol drink!!");
                	}
                	else if (bevShop.isEligibleForMore()) {
                    	if (customerAge >= bevShop.getMinAgeForAlcohol()) {
                        
                        System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
                        System.out.println("Your current alcohol drink order is less than " + (bevShop.getMaxOrderForAlcohol() + 1));
                        System.out.println("Would you please add an alcohol drink");
                        bevName = input.nextLine();
                        System.out.println("what size would you like?\n"
                        				+ "1.Small\n"
                        				+ "2.Medium\n"
                        				+ "3.Large\n");
                        int subChoice = Integer.parseInt(input.nextLine());
                        bevSize = Size.MEDIUM;
                        if (subChoice == 1) {
                        	bevSize = Size.SMALL;
                        } else if (subChoice == 2) {
                        	bevSize = Size.MEDIUM;
                        } else if (subChoice == 3) {
                        	bevSize = Size.LARGE;
                        }
                        bevShop.processAlcoholOrder(bevName, bevSize);
                        System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
                        System.out.println("The current order of drinks is " + bevShop.getNumOfDrinks());
                    	}
                    } else {
                        System.out.println("You have a maximum alcohol drinks for this order");
                    }
                } else if (choice == 2) {
                    System.out.println("Would you please add a COFFEE to your order:");
                    bevName = input.nextLine();
                    System.out.println("what size would you like?\n"
            				+ "1.Small\n"
            				+ "2.Medium\n"
            				+ "3.Large\n");
			            int subChoice = Integer.parseInt(input.nextLine());
			            bevSize = Size.MEDIUM;
			            if (subChoice == 1) {
			            	bevSize = Size.SMALL;
			            } else if (subChoice == 2) {
			            	bevSize = Size.MEDIUM;
			            } else if (subChoice == 3) {
			            	bevSize = Size.LARGE;
			            }
                    bevShop.processCoffeeOrder(bevName, bevSize, false, false);
                    System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
                    System.out.println("The current order of drinks is " + bevShop.getNumOfDrinks());
                } else if (choice == 3) {
                    System.out.println("Would you please add a SMOOTHIE to order:");
                    bevName = input.nextLine();
                    System.out.println("what size would you like?\n"
            				+ "1.Small\n"
            				+ "2.Medium\n"
            				+ "3.Large\n");
			            int subChoice = Integer.parseInt(input.nextLine());
			            bevSize = Size.MEDIUM;
			            if (subChoice == 1) {
			            	bevSize = Size.SMALL;
			            } else if (subChoice == 2) {
			            	bevSize = Size.MEDIUM;
			            } else if (subChoice == 3) {
			            	bevSize = Size.LARGE;
			            }
                    System.out.println("How many fruits would you like to add");
                    int numOfFruits = Integer.parseInt(input.nextLine());
                    if (bevShop.isMaxFruit(numOfFruits)) {
                        System.out.println("You reached a Maximum number of fruits");
                        System.out.println("The current order of drinks is " + bevShop.getNumOfDrinks());
                    } else {
                        bevShop.processSmoothieOrder(bevName, bevSize, numOfFruits, false);
                        System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
                        System.out.println("The current order of drinks is " + bevShop.getNumOfDrinks());
                    }
                } else if (choice == 4) {
                    continueOrder = false;
                } else {
                    System.out.println("Invalid choice!");
                }
            }

            System.out.println(bevShop.getCurrentOrder().toString());

            System.out.println("#------------------------------------#");

            System.out.print("Would you please start a new order? (yes/no): ");
            String startNewOrder = input.nextLine().toLowerCase();
            bevShop.setNumOfDrinks(0);

            if (startNewOrder.equals("no")) {
                break;
            }
        }

        bevShop.sortOrders();
        System.out.println(bevShop.toString());
        System.out.println("Total amount for all Orders: " + bevShop.totalMonthlySale());

        input.close();
    }
}
