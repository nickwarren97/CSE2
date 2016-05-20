



import java.util.*;
public class example4 {
    public static void main(String [] args){
        
    }
    public static char [] stringToChars (String x){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter a string");
        x = myScanner.nextLine();
        int count =0;
        
        for (int i =0; i< x.length;i++){    //count chars ommiting spaces and periods
            if (x.charAt[i] != " " && x.charAt[i] != "."){
                count ++;
            }
        }
        char [] y = new char [count];   //create array big enough for all chars
        count=0;
        
        for (int i = 0; i<x.length;i++){
            if (x.charAt[i] != " " && x.charAt[i] != "."){
                y[count]=x.charAt[i];
                count++;
        }
    }
    return y;
    }
    
}
    