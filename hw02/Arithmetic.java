
public class Arithmetic {
    
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

double totalCostofShirts= (numShirts * shirtPrice;

//total cost of belts

double totalCostofBelts= (numBelts * beltCost);


//tax on pants

double totalTaxOnPants= (totalCostOfPants * paSalesTax);

//tax on shirts

double totalTaxOnShirts= (totalCostOfShirts * paSalesTax);

//tax on belt

double totalTaxOnBelts= (totalCostofBelts * paSalesTax);

//total before tax

double totalBeforeTax= (totalCostOfPants + totalCostOfShirts + totalCostOfBelts);

//tax only

double totalTax= (totalBeforeTax * paSalesTax);

//Total after tax

double totalAfterTax= (totalBeforeTax + totalTax);
//System.out.println(""+variable);
//System.out.printf("$ %.2f",variable);

}

}  


