/* This program will create the output :


         9
        8
       7
      6
     5
    4
   3
  2
 1
0

*/


public class loopPracticeTwo {
    
    public static void main(String [] args) { 
        
        int i = 0, j = 0 ;
        
        for (i=10; i>0; i--) { 
            
            for (j=0; j<i-1; j++) {
                
                System.out.print(" ");
            }
            
            System.out.println(j);
            
         }
    }

}