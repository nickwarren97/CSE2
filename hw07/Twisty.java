//Nick Warren
//CSE 2 
//3-13-16


//This program will use while, for, and do-while loops 
//in order to print a pattern based on the 2 integers provided by user.

//import scanner class
import java.util.Scanner;

//define and label class
public class Twisty {
    
//required for every java program
public static void main(String [ ] args) {
    
//label scanner
Scanner scannerOne = new Scanner (System.in);

//prompt the user to enter an integer value for length
System.out.print("Please enter a positive integer 0-80 for length:");

//define that legth is an integer value
int Length;

//begin while loop
while (true) {
    
    if (!scannerOne.hasNextInt()) { 
        System.out.print("Error.Try again. Please enter a positive integer 0-80.");
        scannerOne.next();
        
    }
    
    //begin else statement
    else{
        
        Length = scannerOne.nextInt();
        
        if (Length < 0 || Length >80) {
        
            System.out.print("Error.Try again. Please enter a positive integer 0-80.");
    }
    
    else{
        break;
        
        }
    }

}

//here I am nesting if statements within a while loop. This will 
//create an error if the user eneters invalid inputs.


System.out.print("Please enter a positive integer 0-80 for width:");

//Define that width is an integer
int Width;

while(true){
    if (!scannerOne.hasNextInt()) {
        
        System.out.print ("Error. Please enter a positive integer 0-80:");
        scannerOne.next(); 
        
    }
    
    else{ 
        
        Width = scannerOne.nextInt() ; 
       
        if (Width < 0 || Width > Length ) { 
            
            System.out.print("Error. Please enter a positive integer for width that is less than the value previously entered for length: ");
        
        }
        
        else{ 
            break; 
            
        }
        
    }
    
}

//here I am nesting if statements within a while loop. This will 
//create an error if the user eneters invalid inputs.

//label counter
int counter = Length;

//show that x will be increasing with each run of the loop 
for (int x = 0 ; x < Width; x++) { 

//here I am beginning the vertical spread
counter= 0;

int y = 0;

while (counter < Length ) { 
    
    for (int z = 0; z < Width; z++) { 
        
        //Create the pattern 
         //begin at y=0
    if (y==0) { 
        
  //create instance in which the slash will be printed      
if ((x+1)==(Width-z) && counter < Length ) {
    
    System.out. print ("/");
    
    counter ++;
    
}
//create the instance in which the hashtag will be printed
else if ( z == x && counter < Length ) { 
    
    System.out.print ("#");
    
    counter ++;
    
}

else {
  
  //create the instance where a space will be printed
   System.out.print( " ");
    
    counter ++;
    
    }
}

if (y==1) {
    
    //create second instance in which a hashtag will be printed
    if ((x+1)==(Width-z) && counter < Length) {
    
    System.out.print ( "#");
    
    counter ++;
    
        } 
    }
}
// switch the y value to print 2nd symbol
if (y==0) { 
    
    y=1;
    
}

//switch the y value to print 1st symbol
else { 
    y=0;
    
                }
            }
        }
    }
}


 