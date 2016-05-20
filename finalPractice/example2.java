/*Working example of using a scanner to create an array of size equal
to the integer value entered by the user.*/


import java.util.Scanner;
import java.util.*;
public class example2 {
    public static void main(String [] args){
        
         Scanner myScanner = new Scanner(System.in);
         int i =0;
   
        
        System.out.println("Please enter the length of the array");
        i = myScanner.nextInt();
        int [] consecutiveNums = new int [i];
        boolean condition = true;
        condition = i<=0;
        if (condition){
              System.out.println ("int must be greater than zero, try again");
              i=myScanner.nextInt();
        }
        else{
            
            for (i=0; i < consecutiveNums.length; i++){
                consecutiveNums[i]=i;
                
                System.out.print(consecutiveNums[i] + "|");
        
            
             }
        System.out.println();
         }
    }
}