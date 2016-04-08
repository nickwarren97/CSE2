//Nick Warren
//CSE 2 
//2-4-16


//This program creates an infinate loop using the symbols "/", "-", "\", "|". This infinate loop will stop once you press (CTRL+C)

//Define the class
public class TextSpinner {
   
    //Required for all java programs
    public static void main (String [ ] args) {
        
       //Define i 
        int i = 4;
        
        //Begin while loop and set conditions
        while (true) {
            
            //When i % 4 has a remainder of zero, print "/"
            if (i % 4 == 0) {
                System.out.print("/");
               //increase i by one
                ++i;
            }
            //When i % 4 has a remainder of one, print "-"
            else if (i % 4 == 1) {
                System.out.print("-");
                //increase i by one
                ++i;
            }
            //If i % 4 has a remainder of two, print "\"
            else if (i % 4 == 2) {
                System.out.print("\\");
                //increase i by one
                ++i;
            }
            //If none of the previous conditions apply, this statement does. "|" will be printed
            else {
                System.out.print("|");
                //increase i by one
                ++i;
                
            }
        }
    }
}