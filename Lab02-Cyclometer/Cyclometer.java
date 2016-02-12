//   Nick Warren
//   2/5/16
//   CSE 002


// Purpose: Measure time, distance, revolutions of a bicycle trip



public class Cyclometer{
    
    public static void main(String [ ] args) {
        
        

int secsTrip1=480; // Number of seconds travaled during trip one 

int secsTrip2=3220;// Number of seconds travaled during trip two

int countsTrip1=1561; // Number of rotations during trip one

int countsTrip2=9037; //Number of rotations in trip two



//Create useful variables 

double wheelDiameter=27.0, //Assign a value to the diameter of the wheel

PI=3.14159, // Assign a value for pi

feetPerMile=5820, // Number of feet in one mile

inchesPerFoot=12, // Number of inches in one foot

secondsPerMinute=60; // Number of seconds in one minute

double distanceTrip1, distanceTrip2, totalDistance; // State that total distance is equal to distanceTrip1+distanceTrip2


//Print stored values

System.out.println("Trip 1 took" + secsTrip1/secondsPerMinute +" minutes and had"+countsTrip1+ " counts."); //Calculate time and rotations of trip1

System.out.println("Trip 2 took" + secsTrip2/secondsPerMinute +" minutes and had"+countsTrip2+ " counts."); //Calculate time and rotations of trip2




//Compute the values for distances

distanceTrip1=countsTrip1*wheelDiameter*PI; //Gives distance in inches for one rotation of the wheel 

distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distnace in miles

distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;

totalDistance=distanceTrip1+distanceTrip2;



//Print out the distances


System.out.println("Trip 1 was "+ distanceTrip1 + " miles");

System.out.println("Trip 2 was "+ distanceTrip2 + " miles");

System.out.println("The total distance was "+totalDistance+" miles");

    }
}
