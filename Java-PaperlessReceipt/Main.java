//Declare variables to store 
    //The price of different items 
    //The quantity
    //The sales tax rate 
    //Enter amount of money

//Calculate and Display 
    //Subtotal (cost without tax)
    //Total sales tax 
    //Total (subtotal + sale tax)
    //Give Change
    import java.util.*; 

    public class Main {
           public static void main (String [] args) {
            System.out.println("ShopSmart Calculator"); 
    
            do {
                System.out.print("Enter the amount: "); //Input for the amount
                Scanner inputPrice = new Scanner(System.in); //Creates a scanner to read the amount
                    double amount = inputPrice.nextDouble();
    
                System.out.print("Enter the quantity: "); //Input the quantity 
                Scanner inputQuantity = new Scanner(System.in); //Creates a scanner to read the quantity 
                    double quantity = inputQuantity.nextDouble();
                    double total;
    
                    total = amount * quantity; 
        
                System.out.print("Total amount: " + total);
                
                //Prompt if want to continue again 
                System.out.print("Do you want to use ShopSmart Calculator again ? ");
                Scanner inputChoice = new Scanner(System.in);
                    String choice = null;
                    choice = inputChoice.nextLine();
    
                    // Checking for input
                    try {
    
                        if (amount == 0 && quantity == 0) {
                            System.out.println("Not a valid amount/quantity");
                        }  
                        
                        else if (choice.equalsIgnoreCase ("yes")) {
                        }
    
                        else if (choice.equalsIgnoreCase ("no")) {
                            System.out.println("Thank you for using ShopSmart Calculator");  
                            break; 
                        } 
                    } 
                    
                    catch (NumberFormatException e) {
                        System.out.println("Not a valid amount/quantity");
                    }
            } 
            
            while (true); 
            
        }
    }
    