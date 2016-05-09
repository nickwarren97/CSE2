//This program takes the user input, and tests to see if the value is even or odd by 
//looking at the remainder when divided by zero



import java.util.Scanner;
public class evenOrOdd {
     public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
     while(true) {  //This is what keeps asking for inout if the value entered was wrong
         System.out.println("enter a value between 1-1000000 : ");
         int userInput = scan.nextInt();
     
         if (userInput < 1 || userInput > 1000000 ) {
         System.out.println("The value entered was not within the range.Try again : ");
     }
     
        else {
         
         if (userInput %2 == 0) {
             System.out.println(" The value entered was even ");
         }
             
             else {
                 System.out.println(" The value entered was odd ");
                     }
                 }
            }
        }
    }


     
     