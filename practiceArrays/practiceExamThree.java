

    import java.util.Scanner;
    import java.util.Arrays;

 public class practiceExamThree {
        
        
            public static void main(String[] args){
                
                int[] A = {4, 7, 25, -7, 13, 23, -16};
                
                for (int i = 1; i<A.length; i++){
                    
                    A[i] = A[ (i+2) % A.length];
                    
                    System.out.println("i: " + i + " i+2 % 7: " + ((i+2)%7) + " A[i]= : " + A[i]);
                }
                

    }

}
