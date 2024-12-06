import java.util.Scanner;


public class Main {
    public static void main (String [] args) {
        
        Scanner loopScanner = new Scanner (System.in);    
        String ans = null; 
        
        System.out.print("If true print yes: ");
        ans = loopScanner.nextLine();

        if (ans.equalsIgnoreCase("yes")) {
            System.out.println("Answer is: " + ans);
            } else {
                System.out.println("engk");
            }
        }
    }