/* 

This program helps practice and understand a method.
The majority of code is in new method, then called in the main method and run, printing 1st array.
I then took that array and added 10 to each value, and printed the new array.

*/



import java.util.*;

public class methodPractice {
    public static void main (String []args ){
       
       
       methode();                           //call method
       int[] a = {1,2,3,4,5};               //needed to re initialize 'a' to create the 2nd array
       int [] b = new int [a.length];       //set new array length equal to old array length 
        for (int i = 0; i<b.length; i++){
             b[i] = a[i]+10;                //each value of 'b' (at given index) is equal to value of 'a' (at given index) + 10
             System.out.print(b[i] + "|");  //print the new array
        }
      
       
       
    }
   
   
    public static int [] methode() {        //create new method of an integer array
        int[] a = {1,2,3,4,5};              //fill integer array
    
        for (int i = 0; i <a.length;i++ ){
            a[i]=1+i;                       //a[index]= index +1
            System.out.print(a[i] + " " + "|");   //print array
    }
    System.out.println();                   //creates nice format when run
    return a;                               //return array 'a' out of this method
    
    }
}
