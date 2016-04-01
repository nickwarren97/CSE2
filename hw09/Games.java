// Nick Warren
//CSE2-Chen
//Games


//This program creates three user-playable games that can be chosen at the beginning of the program. 
//This is done using methods, loops, and appropriate user input. 

import java.util.Scanner;
import java.util.*;



public class Games {
    
    
    public static void main (String [] args) { 
        
    //print welcome message
        System.out.println ("Welcome to nickwarren97's gamecenter");
        
         // create instance to allow people to input data
        Scanner myScanner =  new Scanner(System.in);
       
        
        //prompt user to pick one of three minigames
        System.out.print("Pick a minigame among guessTheBox, spinTheWheel, and scrambler: ");
        String game = "";
        
        //propt user to enter a string variable. if not correctly entered , ask again
        while (true) {
            if (!myScanner.hasNextLine()) {
                System.out.print("Sorry, you did not enter a String variable. Try again: ");
                myScanner.nextLine();
            }
            
            //if user did not enter correctly, ask again
            else {
                game = myScanner.nextLine();
                if (!game.equals("guessTheBox") && !game.equals("spinTheWheel") && !game.equals("scrambler")) {
                    System.out.print("You must choose one of the 3 games listed. Try again: ");
                }
                else {
                   
                   //if entered correctly, leave loop
                    break; 
                }
            }
        }
        
        //use if statements to call guess the box game
        if (game.equals("guessTheBox")) {
            guessTheBox();
        }
        else if (game.equals("spinTheWheel")) {
            
            spinTheWheel();
            //call method for the spin the wheel game
        }
        else {
            //call method for the scrambler game
        }
    }
    
    //begin new method
    public static void guessTheBox() { 
        Scanner myScanner =  new Scanner(System.in);
        int prizeBox = (int)(Math.random() * 3) + 1;
        System.out.println("Pick a box 1-3: ");
        int box = 0;
        while (true) {
            
            //if not correct input, ask again
            if (!myScanner.hasNextInt()) {
                System.out.print("You must enter an integer 1-3. Try again: ");
                myScanner.nextInt();
            }
            //if not 1,2,3 ask again
            else {
                box = myScanner.nextInt();
                if (box != 1 && box != 2 && box != 3) {
                System.out.print("You must choose box 1, 2, or 3. Try again: ");
                }
                else {
                   //leave loop when condition is satisfied
                    break;
                }
            }
        }
       
       //if condition is met, you win
        if (box == prizeBox) {
            System.out.println("Congratulations you filthy animal!");
        }
        //if condition is not met, you lose
        else {
            System.out.println("Sorry youre a loser.");
        }
    }
    
    
    ////////////////Begin  New Method For Spin The Wheel Game//////////////////
    
    //call method
    public static void spinTheWheel() {
        //define scanner
        Scanner myScanner = new Scanner(System.in);
       
        //prompt user input
        System.out.print("Choose a color, either red or black: ");
        
        String color = myScanner.nextLine();
       
       //If not string entered, ask to try again
        while (true) {
            if (!myScanner.hasNextLine()) {
                System.out.print("Sorry, you did not enter a String variable. Try again: ");
                myScanner.nextLine();
            }
            
            //if none of the listed below are entered, ask again
            else {
                
                String game = myScanner.nextLine();
                game = myScanner.nextLine();
                if (!game.equals("Black") && 
                    !game.equals("black") &&
                    !game.equals("Red") && 
                    !game.equals("red")) {
                    System.out.print("You must either red or black (caps dont matter). Try again: ");
                }
                else {
                    
                    //leave loop when recieved appropriate input
                    break; 
                }
            }
        }
        //prompt user to choose a number
        System.out.print("Choose a number 1-5: ");
        int num = myScanner.nextInt();
        while (true) {
           
           //If integer not entered try again
            if (!myScanner.hasNextInt()) {
                System.out.print("You must enter an integer 1-5. Try again: ");
                myScanner.nextInt();
            }
            
            //if 1-5 not entered try again
            else {
                num = myScanner.nextInt();
                if (num != 1 && num != 2 && num != 3 && num != 4 && num != 5) {
                System.out.print("You must choose number 1-5. Try again: ");
                }
                else {
                   
                   //if conditions were met, leave loop
                    break;
            
                }
            }
        }
        
        
        
        //randomly generate a color to serve as computer player
       
       int compColor = (int)(Math.random()*1) + 0;
       
       if (compColor <1 ) {
           
       System.out.println ("Black");    
           
       }
       
       else {
           
           System.out.println ("Red");
       }
      
         int compNumber = (int)(Math.random()*5) + 1;
       
        
        System.out.println ("The number was: " + compNumber);
        
        
        if (color == compColor){
        if (num == compNumber) {
            
            System.out.println (" CONGRATULATIONS YOU WIN!");
            
            
        }
        
        else {
            
            System.out.print("YOU LOSE. TRY AGAIN");
             }
        }
        
    }
}
    
    
        //got stuck on line 188, due to the fact that i can not compare an integer and string type.
        //I did not manage my time well Nd did not have time to correct that issue.
    
    
    
    public static void scrambler(Random randomWord, String inputString) {
        //define scanner
        Scanner myScanner = new Scanner(System.in);
       
        //prompt user input
        System.out.print("please enter a word to be scrambled: ");
        //create variable where user inputs their own word to be scrambled
        String inputString =  myScanner.nextLine();
        
        
    
        



