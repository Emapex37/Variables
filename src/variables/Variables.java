/*
 * March 1, 2017
   Variables.java
   Testing with variables
   Rev 1.0
 */

package variables;

/**
 *
 * @author EvMcQ5970
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age = 17;
        String lastName = "McQueen";
        System.out.println(lastName);
        System.out.println("My age is " + age);
        
        
        double pi = 3.14;
        int cRadius = 15;
        System.out.println("The area of a 15cm circle is " + pi * cRadius * cRadius + "cm");
        
        String wG = "Wayne Gretzky";
        int wGNum = 99;
        System.out.println(wG + " is number " + wGNum);
        
        System.out.println("\nArea of a Rectangle:");
        double rLength = 5.7;
        double rHeight = 4.8;
        System.out.println("Length: " + rLength);
        System.out.println("Height: " + rHeight);
        System.out.println("Area: " + rLength * rHeight);
        
        double h = 40.00;
        double w = 10.55;
        double i = 2.00;
        double t = 0.22;
        double pay = (h*w-i)-t*(h*w-i);
        System.out.println("\nThe pay for someone who works 40 hours at 10.55/h is " + pay);
        
        double carpetLength = 8.5;
        double carpetHeight = 6;
        double carpetArea = carpetLength * carpetHeight;
        System.out.println("\nThe cost to carpet a room with an area of " + carpetArea + " is: " + carpetArea * 19.95);
        
        double tPrice = 12.49;
        double paid = 20.00;
        double HST = 0.13;
        double tax = 12.49 * 0.13;
        double total = tPrice + tax;
        double change = paid - total;
        
        System.out.println("\n\n         SAMPLE RECEIPT");
        
        System.out.println("\n666 5 Salem's Lot");
        System.out.println("NCR Mojave Outpost, Nevada 2281 06");
        System.out.println("999-999-LKY38");
        
        System.out.println("\n----------------------------------");
        System.out.println("Store: 0003         Register: 001");
        System.out.println("Cashier: Snoop Dogg");
        System.out.println("Associate: 0000000");
        System.out.println("----------------------------------");
        System.out.println("CUSTOMER RECEIPT COPY");
        
        System.out.println("\nORIGINAL TRANSACTION INFORMATION");
        System.out.println("  STORE    : 00038");
        System.out.println("  REGISTER : 001");
        System.out.println("  DATE     : 04/11/2281");
        System.out.println("  NUMBER   : 06");
        System.out.println("                             " + tPrice);
        System.out.println("\n==================================");
        System.out.println("SUBTOTAL                     " + tPrice);
        System.out.println("SALES TAX       " + tax);
        System.out.println("TOTAL                      " + total);
        System.out.println("==================================");
        System.out.println("AMOUNT TENDERED");
        System.out.println("Cash                          " + paid);
        System.out.println("  Change                    " + change);
        System.out.println("TOTAL PAYMENT              " + total);
        System.out.println("----------------------------------");
        System.out.println("Transaction: 44921      05/02/2281");
        System.out.println("                           3:42 PM");
        System.out.println("----------------------------------");
        System.out.println("\nSIGNATURE:");
        System.out.println("\n\n_________________________________");
        
        System.out.println("\nTHANK YOU FOR SHOPPING WITH US");
        System.out.println("  WE APPRECIATE YOUR BUSINESS");
        
    }
    
}
