
//Needs charAt method, which was provided in test question.
//Will not run without it, only good to view and understand steps.

/////////VIEW ONLY///////////

import java.util.*;
public class example3 {
    public static void main(String [] args){
        
    }
    public static char[] stringToChars(String x){   //counts # of chars to be copied
        int count =0;
        for (int i =0; i<x.length; i++){
            if (x.charAt(i) != ' ' && x.charAt(i) != '.'){
                count ++;
            }
          
            char [] charArray = new char [count];   //creates array with size = num of chars
            count = 0;
            for (int i = 0; i<x.length<i++){
                if (x.charAt(i) != ' ' && x.charAt(i) != '.'){
                charArray[count]=x.charAt(i);
                 count ++;
                 }
            }
        }
    return charArray;
    }
}
