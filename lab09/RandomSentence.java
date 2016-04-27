//Nick Warren
//CSE 2
//Random Sentence Generator


/* This program will create a randomly generated sentence by 
pulling words from created methods at random, and assembling 
them into sentences. Words will be grouped into the same type
of speech as the other, and puled from their respective location.*/

//switch statements within methods

//Import random utility
import java.util.Random;

//Define class
public class RandomSentence { 
    
    //create a method to store an array of adjectives, randomly generate a number 1-9, and select corresponding adjective.
    public static void adjectives () {
        
        //Create the array
        String [ ] adjectiveArray = new String[10];
        adjectiveArray [0] = "determined";
        adjectiveArray [1] = "anxious";
        adjectiveArray [2] = "clumsy";
        adjectiveArray [3] = "peaceful";
        adjectiveArray [4] = "sparkling";
        adjectiveArray [5] = "cruel";
        adjectiveArray [6] = "eager";
        adjectiveArray [7] = "attractive";
        adjectiveArray [8] = "jolly";
        adjectiveArray [9] = "vengeful";

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = (int)(Math.random() * 9);

if (randomNum == 0) {
    System.out.println(" The " + adjectiveArray [0]);
}
else if (randomNum == 1) { 
    System.out.println(" The " + adjectiveArray [1]);
}
else if (randomNum == 2) { 
    System.out.println(" The " + adjectiveArray [2]);
}
else if (randomNum == 3) { 
    System.out.println(" The " + adjectiveArray [3]);
}
else if (randomNum == 4) { 
    System.out.println(" The " + adjectiveArray [4]);
}
else if (randomNum == 5) { 
    System.out.println(" The " + adjectiveArray [5]);
}
else if (randomNum == 6) { 
    System.out.println(" The " + adjectiveArray [6]);
}
else if (randomNum == 7) { 
    System.out.println(" The " + adjectiveArray [7]);
}
else if (randomNum == 8) { 
    System.out.println(" The " + adjectiveArray [8]);
}
else if (randomNum == 9) { 
    System.out.println(" The " + adjectiveArray [9]);
        }

    }

   //Main method required for all java programs
    public static void main(String [ ] args) {
        adjectives();
        
    }
}
 
        
       
        
            
            
            
            
            
            
            
        
        
        
        


