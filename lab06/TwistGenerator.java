//Nick Warren
//CSE2
//Lab06
//3-4-16


//Create and print output in the given pattern


//Import scanner
import java.util.Scanner;   

//Import class
public class TwistGenerator {  
    
    //Required for every java program
    public static void main(String [ ] args) {  
        //assign varable to entered value
        Scanner myScanner = new Scanner(System.in);
        
        //Prompt user to enter a positive integer
        System.out.print ("Enter a positive integer ");
        
        //Declare length as user-entered input
        int length;
        while (true) {
           
           //If integer type was not entered, try again
            if (!myScanner.hasNextInt()) {
                System.out.print("You must enter an integer. Try again: ");
                myScanner.next();
            }
            
            //If a value less than one was entered, prompt user to try again
            else {
                length = myScanner.nextInt();
                if (length < 1) {
                    System.out.print("int must be positive. Try again: ");
                }
                else {
                    break;
                }
            }
        }
       
        //Set parameters for the "for" loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0;  j < length; j++) {
                if (i == 0) {
                    if (j % 3 == 0) {
                        System.out.print("\\");
                    }
                    if (j % 3 == 1) {
                        System.out.print(" ");
                    }
                    if (j % 3 == 2) {
                        System.out.print("/");
                    }
                    if (j == length - 1) {
                        System.out.println();
                    }
                }
               
                //Print the third row of output
                else if (i == 2) {
                    if (j % 3 == 0) {
                        System.out.print("/");
                    }
                    if (j % 3 == 1) {
                        System.out.print(" ");
                    }
                    if (j % 3 == 2) {
                        System.out.print("\\");
                    }
                    if (j == length - 1) {
                        System.out.println();
                    }
                }
               
                //Print the middle row of output
                else {
                    if (j % 3 == 1) {
                        System.out.print("X");
                    }
                    else {
                        System.out.print(" ");
                    }
                    if (j == length - 1) {
                        System.out.println();
                    }
                }
            }
        }
    }
}
     

     
