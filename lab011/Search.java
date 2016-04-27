//Nick Warren
//CSE 2
// Search


//This program will perform linear and binary searches on a number of arrays.

//import scanner
import java.util.Scanner;

//begin class
public class Search {
    
    //required for all java programs
    public static void main(String [] args) {
    
     Scanner scanner1 = new Scanner(System.in);
            
     System.out.println ("Please enter the number you wish to find in the array");
            
     int searchingFor = scanner1.nextInt();
       
        int[] array1 = new int [100];
       
        for(int i = 0; i < array1.length; i++) {
           
            array1[i] = (int)(Math.random() * 100);
           
            System.out.println(array1[i] + "  ");
          
            
            if (searchingFor == array1[i]) {
                
                System.out.println ("Found the number in the " + i +"th place");
                
                if (searchingFor != array1[i]) {
                    
                    System.out.println ("Sorry, that value does not exist in this array");
                }
                
                
                
                
            }
            
        }
    }
}