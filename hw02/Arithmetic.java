//Nick Warren 
//CSE 002
//Hw #2 Arithmetic.java

//define class

public class Arithmetic {
    
    //required for all java programs
    
     public static void main(String [ ] args) {
        
//Number of pairs of pants

int numPants = 3;

//Cost per pair of pants

double pantsPrice = 34.98;

//Number of sweatshirts

int numShirts = 2;

//Cost per shirt

double shirtPrice = 24.99;

//Number of belts

int numBelts = 1;

//cost per box of envelopes

double beltCost = 33.99;

//the tax rate

double paSalesTax = 0.06;

//total cost of pants

double totalCostOfPants= (numPants * pantsPrice);

//total cost of shirts

double totalCostOfShirts= (numShirts * shirtPrice);

//total cost of belts

double totalCostOfBelts= (numBelts * beltCost);

//tax on pants

double totalTaxOnPants= (totalCostOfPants * paSalesTax);

//tax on shirts

double totalTaxOnShirts= (totalCostOfShirts * paSalesTax);

//tax on belt

double totalTaxOnBelts= (totalCostOfBelts * paSalesTax);

//total before tax

double totalBeforeTax= (totalCostOfPants + totalCostOfShirts + totalCostOfBelts);

//tax only

double totalTax= (totalBeforeTax * paSalesTax);

//Total after tax

double totalAfterTax= (totalBeforeTax + totalTax);


//From this point on, the print statements will be printing the calculations


System.out.println("Total Cost of Pants Before Tax: " + "$" + totalCostOfPants);

System.out.println("Total Cost of Shirts Before Tax: " + "$" + totalCostOfShirts);

System.out.println("Total Cost of Belts Before Tax: " + "$" + totalCostOfBelts);



System.out.println("Total Tax On Pants: " + "$" + totalTaxOnPants);

System.out.println("Total Tax On Shirts: " + "$" + totalTaxOnShirts);

System.out.println("Total Tax On Belts: " + "$" + totalTaxOnBelts);



System.out.println("Total Before Tax: " + "$" + totalBeforeTax);

System.out.println(" Total Tax On Transaction:" + "$" + (totalBeforeTax * paSalesTax));

System.out.println("Total After Tax: " + "$" + totalAfterTax);

    }
    
}  


