//Nick Warren
//CSE002
//Holoportation





import java.util.Arrays; //import array utility
import java.util.Random; //import random utility


public class holoportation { //define class

    
    public static void main(String[] args) { //required for all java programs
      String[][][] arr = soRandom(); //create 3 dimensional array
      fillArray(arr); //create the empty array
      printArray(arr); //print the array
      
    }
    public static boolean printArray(String[][][]arr){ //create new boolean method
         for (int x = 0; x < arr.length; x++){  //begin outside for loop
            for (int y = 0; y < arr[x].length; y++){ //begin 1st inner for loop
                for (int z = 0; z < arr[x][y].length; z++){ //begin 2nd inner for loop
                        System.out.println( //print line
        Arrays.deepToString(arr)
                .replace("],", "],\n ")
                .replace("]],", "]],\n"));       
                    }
                }
            }
         return true; //return method
    }
    public static String coder(){ //create new string method
        String code = ""; //create string "code"
         char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L', //fill array with characters
        'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
         Random rand = new Random(); //new random value
        char one = alphabet[rand.nextInt(25)]; //match letters with randomly generated integers
       char two = alphabet[rand.nextInt(25)]; //match letters with randomly generated integers
  
       int three = rand.nextInt(10); // generate random number up to 10
       String thr = Integer.toString(three);
      
       int foour = rand.nextInt(10); // generate random number up to 10
       String four = Integer.toString(foour);
       
       int fiive = rand.nextInt(10); // generate random number up to 10
       
       String five = Integer.toString(fiive);
       
        code = one+""+two+""+three+""+four+""+five; //define possible values for "code" when called
        return code; //return method
    }
    public static String[][][] fillArray(String[][][] arr){ //new string method
        for (int x = 0; x < arr.length; x++){ //create outermost for loop
            for (int y = 0; y < arr[x].length; y++){ //create inner for loop
                for (int z = 0; z < arr[x][y].length; z++){ //create innermost for loop
                arr [x] [y] [z] = coder (); //fills array with values, so no longer prints "null"
                   
                    }
                }
            }
        return arr; //return array arr
    }
   
    public static String[][][] soRandom(){ //call method
        Random rand = new Random(); //random value
        int lengthx = rand.nextInt(10-1)+1; //generate random integer for x
        int lengthy = rand.nextInt(10-1)+1; //generate random integer for y
        int lengthz = rand.nextInt(10-1)+1; //generate random integer for z
        String[][][] arr = new String[lengthx][][]; // fill x array with length
        
        for(int i = 0; i<arr.length; i++){ // create loop that will fill y
            arr[i] = new String[lengthy][]; //^^^
        }
        int count = 0; //begin count at 0
        for(int j = 0; j<arr.length; j++){
            for (int x = 0; x<arr[j].length; x++){
                arr[j][x] = new String[lengthz];
            }
        }
                return arr; //return array
    }
   
       
}



//all I could finish