//Nick Warren
//CSE2
//2/15/16


//This is a program to convert between meters and inches when the user inputs a value.



//import scanner 

import java.util.Scanner ; 

//create and define class

public class Convert {
    
//create main method
    
public static void main (String [ ] args) {
    
//prompt the user for an input

System.out.println ("Enter a distance in meters");

//create scanner to accept user input

Scanner myScanner = new Scanner(System.in);

//set variable for meters 

double nMeters = myScanner.nextDouble ();

//set variable and calculation for inches

double inches = (nMeters * 39.3701);

//print the answer for the number of inches given the user input for meters

System.out.println (nMeters + " meters is " + inches + " inches ");



    }
}

