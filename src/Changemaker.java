import java.util.Scanner;

public class Changemaker {
	
          public static void main(String[] args) {
              takeInput();
              
              int quarters=25;
              int dimes= 10;
              int nickels=5;
              int pennies=1;
    // Directions: Give someone change and determine the coins to give back.
	}

          public static void takeInput() {
          Scanner scanner = new Scanner(System.in);
          // take user input 
          System.out.println("Enter an integer between 1 and 99 to see how much change you get back");
          int amount = scanner.nextInt();
		  int quarters = (amount / 25);
		  int amount2 = (amount % 25);
		  // display change output
		  System.out.println(quarters+ " quarters");
		  int amount3 = (amount2 % 10);
	      int dimes=(amount2 / 10);
		  System.out.println(dimes + " dimes");
		  int amount4 = (amount3 % 5);
		  int nickels = (amount3 /5);
		  System.out.println(nickels+ " nickels");
		  int amount5 = (amount4 % 1);
		  int pennies = (amount4 /1);
		  System.out.println(pennies+ " pennies");
		  
          }
		  
		  
          
          }
          
         
          
          
	
