//Nick Warrren
//Cse2
//2-4-16

//This program will create a Fibonacci sequence for the value entered by the user 



//Import scanner
import java.util.Scanner;

//Define class
public class Fibonacci{
    
    //Required for every java program
    public static void main(String [ ] args) {
       
        //Create new scanner
         Scanner myScanner = new Scanner(System.in);   
         //Prompt user to enter the first number to begin the fibonacci sequence
         System.out.print("Enter the first number in the sequence: ");
         //Define firstNum , which is the first user-entered number
         int firstNum;
         
         //Begin while loop
         while (true) {
           
           //If integer was not entered, try again
            if (!myScanner.hasNextInt()) {
                System.out.print("You must enter an integer. Try again: ");
                myScanner.next();
            }
            
            //Condition is satisfied, leave the loop
            else {
                firstNum = myScanner.nextInt();
                break;
            }
        }
        //Prompt user to enter a second number in the sequence
        System.out.print("Enter the second number in the sequence: ");
        
        //Define secondNum as the second user-entered integer
         int secondNum;
         
         //Begin while loop
         while (true) {
           
           //If integer was not entered, try again
            if (!myScanner.hasNextInt()) {
                System.out.print("You must enter an integer. Try again: ");
                myScanner.next();
            }
            
            //Condition is met, leave the loop
            else {
                secondNum = myScanner.nextInt();
                break;
            }
        }
        
        //Asl the user to enter an integer that correllates to the number of numbers being printed
        System.out.print("How many Fibonacci numbers should be printed?: ");
        
        //Define numNums
         int numNums;
         
         //Begin while loop
         while (true) {
           
           //If integer was not entered, try again
            if (!myScanner.hasNextInt()) {
                System.out.print("You must enter an integer. Try again: ");
                myScanner.next();
            }
            
            //Condition is met, leave the loop
            else {
                numNums = myScanner.nextInt();
                break;
            }
        }
        //Define variables
        int j = 0;
        int fibonacci = 0;
        int holder = 0;
       
       //Print the first number, a comma, a second number, a comma
        System.out.print(firstNum + ", " + secondNum + ", ");
        
        //Begin for loop. This is the actual fibonacci sequence mathematically.
        for (int i = 0; i < numNums - 2; i++) {
            holder = secondNum;
            fibonacci = firstNum + secondNum;
            secondNum = fibonacci;
            firstNum = holder;
            
            //Print comma if this condition is met
            if (i != numNums - 3) {
                System.out.print(fibonacci + ", ");
            }
            //Print a period if this condition is met. This condition is only met once, at the ery end of the program.
            else {
                System.out.println(fibonacci + ".");
            }
        }
    }
    
}
         
         
         
         


