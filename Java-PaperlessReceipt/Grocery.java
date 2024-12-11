import java.util.Scanner;

public class Grocery {
    public static void main (String [] args){
        System.out.println("Welcome to ShopSmart \n");

        Scanner input = new Scanner(System.in);
        double grandTotal = 0;

        System.out.println("1. Continue");
        System.out.println("2. Creator");
        System.out.println("2. Exit \n");

        System.out.print("Enter your choice: ");

        int choice1 = input.nextInt();

        do {
            if (choice1 == 1){
                break;
            } else if (choice1 == 2){
                System.out.println("Hi I am Renz Viloria, and my goal for this project is to elimate paper receipts. I am a first year Computer Science student.");
                break;
            } else {
                System.out.println("Thank you for using ShopSmart!");
                return;
            }
        } while (true);

        do {
            System.out.print("Enter the amount: ");
                double amount = input.nextDouble();

            System.out.print("Enter the quantity: "); 
                double quantity = input.nextDouble();
                double total = amount * quantity;

                grandTotal += total;

            System.out.print("Current amount: " + total);

            System.out.println("\nDo you want to add or exit?\n");
            System.out.println("1. Add");
            System.out.println("2. Exit");
            System.out.print("Enter your choice here: ");

            int choice2 = input.nextInt();

                if (choice2 == 1){
                    continue;
                } else if (choice2 == 2){
                    System.out.println("Thank you for using ShopSmart");
                    System.out.println("Grand total: " +grandTotal);
                    break;
                } else {
                    break; 
                }
            
        } while (true);

    }
}