/*Prints a 2d array from scanner. Ex: (10 rows, 5 columns) prints values as such:

01234
01234
01234
01234
01234
01234
01234
01234
01234
01234
*/


import java.util.Arrays; 
import java.util.Scanner;
    
    public class example1{
public static void main (String [] args){
    
    Scanner myScanner = new Scanner(System.in);
    int rows = 0;
    int columns = 0;
    
   
    System.out.println("Enter the number of rows");
   rows = myScanner.nextInt();
     System.out.println("enter the number of columns");
    columns = myScanner.nextInt();
    
    int [][] myArray = new int [rows][columns];
    int j = 0;
     for (int i = 0 ;i<myArray.length ;i++ ){
         myArray[i][j] = i;
            for ( ;j<myArray[i].length ;j++ ){
        myArray[i][j]=j;
       System.out.print(myArray[i][j]);
       } 
    j = 0;
    System.out.println();   
    }
}

}