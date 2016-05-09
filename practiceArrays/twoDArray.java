//Basic two dimentional array with students grades and loops
//Prints out each array in a table like format using loops

public class twoDArray{

public static void main(String []args){
    
 int[][] grades = {{22,33,44},
                   {55,66,77},
                   {88,99,100}};
                   
  for (int rows = 0; rows<grades.length;rows++) {
      
      for (int columns = 0; columns< grades[rows].length; columns++){
         System.out.print( grades[rows][columns]+ "\t" );
      }
         System.out.println();
         }
    }
}

 
 