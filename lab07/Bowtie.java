//Nick Warren
//CSE 2
//3-27-26


//This program will use nested loops in order to create a vertical bowtie-shaped pattern in the output

//Define class
public class Bowtie {
    
    //Required for all java programs 
    public static void main (String [ ] args) { 
        int nStar = 9;
        int counter = 1;
        int poop = 0;
        int spaces = 0;
        while(poop < 10) {
            while (spaces < nStar) {
                while (spaces <= counter || spaces >= nStar - counter) {
                    System.out.print(" ");
                    spaces++;
                }
                System.out.print("*");
                spaces++;
            }
            poop++;
            counter++;
            System.out.println();
        }
    }
}
