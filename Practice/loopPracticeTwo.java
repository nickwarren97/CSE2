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