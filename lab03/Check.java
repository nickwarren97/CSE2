//Nick Warren
//2/12/16
//CSE 002

//Write pogram to split a bill amongst multiple people

//import scanner
import java.util.Scanner;


//create the public class
public class Check {
    
    //create main method
    public static void main(String [] args) {

//name scanner
Scanner myScanner = new Scanner( System.in );


//prompt user to input the original cost of the bill

System.out.print( " Enter the original cost of the check in the form xx.xx : " );

//assign variable to checkCost

double checkCost = myScanner.nextDouble();

//prompt user to enter the desired percent tip

    System.out.print ( " Enter the percentage tip that you wish to pay as a whole number  : ");

//assign a value to tipPercent variable

double tipPercent = myScanner.nextDouble();

//assign a value to tipPercent variable

tipPercent /= 100;


//prompt for the number of people splitting the bill

System.out.print( " Enter the number of people who went out to dinner : " );

//define variable

int numPeople = myScanner.nextInt();

//define variable

double totalCost;

//define variable

double costPerPerson;

//define variable

int dollars,dimes,pennies;

//define total cost

totalCost = checkCost * (1 + tipPercent);

//define cost per person

costPerPerson = totalCost / numPeople;

//define currency values

dollars=(int)costPerPerson;

//define currency values

dimes=(int)(costPerPerson * 10) % 10;

//define currency values

pennies=(int)(costPerPerson * 100) % 10;

//print final answer of how much each person owes with tip included

System.out.println ("The cost per person is " + dollars  + "." + dimes + pennies);

        
    }
}



    

