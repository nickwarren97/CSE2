

//Sorts and linear searches the one dimensional array

import java.util.Arrays;
public class sortArray{
    
    public static void main (String [] args){
  
        int [] myArray = {11,34,22,56,43,77,65,66,82,81};   //create array
       
        Arrays.sort(myArray);   //shortcut to sort array in ascending order
        
        
        
        
        /* if you only wanted to print sorted array:
        
        ex: for(int i = 0; i < myArray.length; i++){
            System.out.println (myArray[i]);
        }  
        
        */
       
       
       
        
        int key = 77;

           int i = 0;
           boolean found = false;    // set the boolean value to false until the key is found

          for ( i = 0; i < myArray.length; i++)
          {
                 if (myArray[ i ]  == key)
                {
                         found = true;      
                         break;
                 }
           }

          if (found)   //When found is true, the index of the location of key will be printed.
          {
                System.out.println("Found " + key + " at index " + i + ".");
          }
          else
          {
                System.out.println(key + " is not in this array.");
          }
      }
}