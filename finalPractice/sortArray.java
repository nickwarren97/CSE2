/*Takes original array of random values, prints, then sorts and prints
the sorted array in a nice format:

1|54|32|11|78|80|46|17|33|59|= Original Array
1|11|17|32|33|46|54|59|78|80|= Sorted Array


*/


import java.util.*;
import java.util.Arrays;
public class sortArray {
    public static void main(String [] args){
        
         int [] myArray = {1,54,32,11,78,80,46,17,33,59};
       
        for (int k =0; k<myArray.length;k++){
            System.out.print(myArray[k] + "|");
        }
        System.out.println("= Original Array");
        java.util.Arrays.sort(myArray);
        
        
        
        for (int i =0; i < myArray.length; i ++){
            System.out.print(myArray[i]+"|");
                }
                System.out.println("= Sorted Array");
            }
        }
    

        
        
        
        
        
        
        