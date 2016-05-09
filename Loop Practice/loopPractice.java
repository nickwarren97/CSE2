/* This program will print the output:


1
12
123
1234
12345


*/


public class loopPractice{ 

public static void main (String [] args) {
    
    int i = 0, j = 0;
    
    for (i=0; i<6; i ++) { 
        
        for (j=0; j<i; j++){
            
            System.out.print(j+1 );
        }
        
        System.out.println();
        }

    }

}