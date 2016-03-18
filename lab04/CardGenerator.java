//Nick Warren 
// CSE 2
//Lab 04

//The goal of this program is to randomly chenerate a card based on a standard deck (not including jokers) 
//This program is not the most efficient way, however it gets the job done



import java.util.Random; //import java utility



public class CardGenerator { //define class
    

   
    public static void main(String [ ] args) {   //required for every java program 
      
    
     // choose random number between 1 and 52
   int card1 = (int)(Math.random() * 52) + 1; 
     
     //create a string composed of the suit of the card
     String cardSuit;
     
     //create a string composed of the rank of the card
     String cardRank;
     
     //create if statement in between the given parameters for each of the four suits
     if (card1 > 0 && card1 <= 13){ 
     cardSuit = "diamonds";
    }
    else if (card1 > 13 && card1 <= 26){
     cardSuit = "clubs";
    }
    else if (card1 > 26 && card1 <= 39){
     cardSuit = "Hearts";
    }
    else if (card1 > 39 && card1 <= 52){
     cardSuit = "Spades";
    
    }
    
    ///////////////////////////
    //Here I am creating a switch statement in order to determine the suit of the card, based off the randomly generated number.
    //This is applicable to all 52 cards/cases
    
    switch ( card1 ){
      
      case 1: 
     cardRank="ace";
     cardSuit = "diamonds";
     System.out.println("You picked an "+cardRank+" of "+cardSuit+".");
    break;
    
    
    case 2: 
     cardRank="2";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 3: 
     cardRank="3";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 4: 
     cardRank="4";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 5: 
     cardRank="5";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 6: 
     cardRank="6";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 7: 
     cardRank="7";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 8: 
     cardRank="8";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 9: 
     cardRank="9";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 10: 
     cardRank="10";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 11: 
     cardRank="jack";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 12: 
     cardRank="queen";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 13: 
     cardRank="king";
     cardSuit = "diamonds";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 14: 
     cardRank="ace";
     cardSuit = "clubs";
     System.out.println("You picked an "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 15: 
     cardRank="2";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 16: 
     cardRank="3";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 17: 
     cardRank="4";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 18: 
     cardRank="5";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 19: 
     cardRank="6";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 20: 
     cardRank="7";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 21: 
     cardRank="8";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 22: 
     cardRank="9";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 23: 
     cardRank="10";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 24: 
     cardRank="jack";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 25: 
     cardRank="queen";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 26: 
     cardRank="king";
     cardSuit = "clubs";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 27: 
     cardRank="ace";
     cardSuit = "hearts";
     System.out.println("You picked an "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 28: 
     cardRank="2";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 29: 
     cardRank="3";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 30: 
     cardRank="4";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 31: 
     cardRank="5";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 32: 
     cardRank="6";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 33: 
     cardRank="7";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 34: 
     cardRank="8";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 35: 
     cardRank="9";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 36: 
     cardRank="10";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 37: 
     cardRank="jack";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 38: 
     cardRank="queen";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 39: 
     cardRank="king";
     cardSuit = "hearts";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 40: 
     cardRank="ace";
     cardSuit = "spades";
     System.out.println("You picked an "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 41: 
     cardRank="2";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 42: 
     cardRank="3";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 43: 
     cardRank="4";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 44: 
     cardRank="5";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 45: 
     cardRank="6";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 46: 
     cardRank="7";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 47: 
     cardRank="8";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 48: 
     cardRank="9";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 49: 
     cardRank="10";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 50: 
     cardRank="jack";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 51: 
     cardRank="queen";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
    case 52: 
     cardRank="king";
     cardSuit = "spades";
     System.out.println("You picked a "+cardRank+" of "+cardSuit+".");
    break;
   
   
      }
   
   
    }
    
}
   
    
    
    
     
     
     
   
    
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    



  
  