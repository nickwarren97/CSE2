//Nick Warren
//2/20/16
//CSE2-Brian Chen 
//Create a program that converts RGB values to hexidecimal values

//import scanner
import java.util.Scanner;
public class ToHex {

    //required for all java programs
    public static void main(String[] args) {
        int red = 0;//begin red at 0
        int green = 0;//begin green at 0
        int blue = 0;//begin blue at zero
        Scanner input = new Scanner(System.in);//prompt user to enter input
        
        System.out.println("Enter three numbers representing three RGB values.(In order of Red, Green, Blue :");
        do{ 
            System.out.println("Enter a number for Red: ");
            red = input.nextInt();
            if(red>255 || red<0){//if not in between these values, print error message
               System.out.println("Error.Enter numbers from 0-255 for red :");  
            }
        }while(red>255 || red<0);
        //
        do{ 
            System.out.println("Put in a number for Green.");
            green = input.nextInt();
            if(green>255 || green<0){//if not in between these values, print error message
               System.out.println("Error.Enter numbers from 0-255 for green :");  
            }
        }while(green>255 || green<0);
        //
         do{ 
            System.out.println("Put in a number for Blue.");
            blue = input.nextInt();
            if(blue>255 || blue<0){//if not in between these values, print error message
               System.out.println("Error.Enter numbers from 0-255 :");  
            }
        }while(blue>255 || blue<0);
       System.out.println("The Hex representation of those numbers is: " + getHexConversion(red,green,blue));//print result
    }
    public static String convertToHex(int num){//create new method
        String rFloor = "";
        String rRemain = "";
        String hex = "";
        if(num/16>9){
            switch (num/16){//set cases to simplify the program. Each case corresponds to a letter
                case 10: rFloor = "A";
                break;
                case 11: rFloor = "B";
                break;
                case 12: rFloor = "C";
                break;
                case 13: rFloor = "D";
                break;
                case 14: rFloor = "E";      
                break;
                case 15: rFloor = "F";
                break;
            }
            hex+=rFloor;
        }else if(num/16<=9){
             rFloor = Integer.toString(num/16);
             hex+=rFloor;
          }          
        if(num%16>9){        
            switch (num%16){//set cases to simplify the program. Each case corresponds to a letter
                case 10: rRemain = "A";
                break;
                case 11: rRemain = "B";
                break;
                case 12: rRemain = "C";
                break;
                case 13: rRemain = "D";
                break;
                case 14: rRemain = "E";
                break;
                case 15: rRemain = "F";
                break;
            }
            hex+=rRemain;
            }else if(num%16<9){
            hex+=Integer.toString(num%16);
        }
            return hex;//return value
        }
    public static String getHexConversion(int red, int green, int blue){
      String FullHex = "";//call methods
      String redHex = convertToHex(red);
      String greenHex = convertToHex(green);
      String blueHex = convertToHex(blue);
      FullHex+= redHex+greenHex+blueHex;
      return FullHex;//return final result
}
    
}
