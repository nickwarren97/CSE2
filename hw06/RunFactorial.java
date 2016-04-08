//Nick Warren 
//CSE 002
//2-4-16




//This program will ask the user from an input 9-16, and return the factorial of the entered value. In short, a calculator for only factorials.


//Import scanner
import java.util.Scanner;

//Define class
public class RunFactorial{
    
    //Required for every java program
    public static void main(String [ ] args) {
        
        //Create and label the scanner
         Scanner myScanner = new Scanner(System.in);   
         
         //Prompt the user to enter an integer between 9 and 16
         System.out.print("Please enter an integer that is between 9 and 16: ");
        
        //Declare viariable num
        int num;
         
         //Begin while loop
         while (true) {
           
           //If an integer is not entered, try again
            if (!myScanner.hasNextInt()) {
                System.out.print("Enter an int between 9 and 16. Try again: ");
                myScanner.next();
            }
            
            //If a value 1-5 is not entered, try again
            else {
                num = myScanner.nextInt();
                if (num < 9 || num > 16) {
                    System.out.print("Enter an int between 9 and 16. Try again: ");                    
                }
                //Otherwise, exit the loop
                else {
                    break;
                }
            }
        }
        
        //Declare variables. 
        int factorial = 1;
        int factNum = num;
        //This part of code creates the actual Fibonacci sequence loop.
        for (int i = 0; i < num; i++, factNum--) {
            factorial *= factNum;
        }
        //When conditions are satisfied, print the factorial.
        System.out.println(num + "! = " + factorial);
    }
}