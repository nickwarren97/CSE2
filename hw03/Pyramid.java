//Nick Warren
//CSE2 
//Pyramid



//Create a program to calculate the volume of a pyramid, given input for a length, with, and height


//import scanner 

import java.util.Scanner ; 

//create and define class

public class Pyramid {
    
//create main method, required for every java program
    
public static void main (String [ ] args) {
    
//prompt user to enter length

System.out.println ("Enter a length");

//set scanner to desired variable

Scanner scanLength = new Scanner(System.in);

//set variable for length

double nLength = scanLength.nextDouble ();

//prompt user to enter a width
 
 System.out.println ("Enter a width");

//set scanner to desired variable

Scanner scanWidth = new Scanner(System.in);

//set variable for width

double nWidth = scanWidth.nextDouble ();

//prompt user to enter a height
 
 System.out.println ("Enter a height");

//set scanner to desired variable

Scanner scanHeight = new Scanner(System.in);

//set variable for height 

double nHeight = scanHeight.nextDouble ();

//set variable for volume

double nVolume = (nLength*nWidth*nHeight)/(3);

//calculate and print the volume of the pyramid

System.out.println ( nVolume + "volume is");  

}

}
    