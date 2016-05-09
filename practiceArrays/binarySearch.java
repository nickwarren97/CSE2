//program crates and sorts an array, then uses a binary search
//to locate what indice the value is located at


import java.util.Scanner;
import java.util.Arrays;
public class binarySearch
{
   public static void main(String[] args){
       searchArray();
   }
     public static int searchArray (){
           
           int[ ] myArray = { 12, 13, 2, 33, 23, 31, 22, 6, 87, 16 };
           
           Arrays.sort(myArray);
           
           
           int key =33;
           int low = 0;
           int high = myArray.length - 1;
           for(int i = 0; i < myArray.length; i++){
               System.out.println(myArray[i]);
          }
         
          while (high >= low) {
            int mid = (low + high) / 2;
            
            if (key < myArray[mid]){
                    high = mid - 1;
                
            } else if (key == myArray[mid]){
                
                System.out.println("The value you searched for is in space number "+ mid + "." + " Value searched for: "+myArray[mid]);
                return mid;
            } else {
                    low = mid + 1; 
                
            }
               
        }
           System.out.println("-1");    
        return -1;
        
      
    }
    
   
}