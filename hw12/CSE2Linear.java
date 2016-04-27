//Nick Warren
//CSE 2
//4-14-16


//This program will search single-dimensional arrays for a specific value.


import java.util.Scanner;//import scanner
import java.util.Random;//impord random number generator
public class CSE2Linear {//define class
//required for all java programs
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//declare scanner and have it accenpt user input
        System.out.println("Enter in 15 student grades.");//prompt user to enter 15 grades
        int[] Grades = new int[15];//create single dimensional array
        int grade1 = 0;//start at zero
        int grade2 = 0;//start at zero
        for(int i = 0; i<15; i++){//begin outer for loop
            Boolean isGood = false;//declare boolean
            do{
                 Grades[i] = input.nextInt();//the grade is equal to the integer entered by the user
                while(Grades[i]>100){//condition mmust be satisfied or will print error
                    System.out.println("The Integer you input was over 100!");
                    Grades[i] = input.nextInt();//Prompt again for user input
                }
                while(Grades[i]<0){//condition mmust be satisfied or will print error
                    System.out.println("The Integer you input was under 0!");
                    Grades[i] = input.nextInt();//Prompt again for user input
                }if(i != 0){
                    while(Grades[i]<= Grades[i-1]){//condition mmust be satisfied or will print error
                    System.out.println("The Integer you input was not greater than the last!");
                    Grades[i] = input.nextInt();//Prompt again for user input
                    }
                }else{
                        isGood = true;
                    }
                
            }while(Grades[i]>100 || Grades[i]<0 && isGood);//begin while loop for set conditions
        }
        for(int x = 0; x<15; x++){
            System.out.print(Grades[x] + " ");
        }
        System.out.println("Enter a grade to search for");
        grade1 = input.nextInt();//Enter the grade you are searching for
        BinarySearch(Grades, grade1);
          
        System.out.println("Scrambled");//notify when the array has been scrambled
        if(ScrambleArray(Grades)){
            System.out.println("Scrambled");
        }
        System.out.println("Enter a grade to search for");
        grade2 = input.nextInt();//Enter the grade you are searching for
        int indexForLinear = LinearSearch(Grades, grade2);
        if(indexForLinear == -1){
            System.out.println(grade2 + " was not found in " + indexForLinear + " iterations");//print number of iterations it took
        }
         if(indexForLinear != -1){
            System.out.println(grade2 + " was found in " + indexForLinear + " iterations");//print number of iterations it took
        }
    }
    public static boolean ScrambleArray(int[]g){//new method ScrambleArray
        Random rand = new Random();
        for(int i = g.length-1; i>0; i--){//begin for loop 
           int randomPos = rand.nextInt((14-0)+1);//generate random value
           int swap = g[randomPos];
           g[randomPos] = g[i];
           g[i] = swap;
        }
        for(int x = 0; x<15; x++){//begin for loop, not nested
            System.out.print(g[x] + " ");
        }
        return true;
    } 
    public static int BinarySearch(int[] g, int num){//new method BinarySearch
        if(g.length == 0){//test condition
            System.out.println("Array length is 0? Returning 0.");
            return 0;
        }//Below this tests the conditions to see what value should be printed.It then prints appropriate message/value.
        int found = -1;
        int x = g.length-1;//high
        int i = 0;//low
        int count = 0;
        while(i<=x){
            count++;
            found = (x+i)/2;
            if(g[found]>num){
                x = found-1;
            }else if(g[found]<num){
                i = found+1;
            }else{
                 if(found != -1){
                     found = found+1;
            System.out.println("Found " + num + " at the " + found + " position in the array, with an iteration of " + count);//print where value was found
                }else if(found == -1){
                    System.out.println("Could not find " + num + " in " + count + " iterations");//print when value can not be found
                }
                return found;
            }
        }
        return found;
    }
    public static int LinearSearch(int[] g, int num){//call method
        for(int i = 0; i<g.length; i++){//begin for loop
            if(num == g[i]){//test condition
                return i+1;//return appropriate value
            }
        }
        return -1;// return value
    }
    
}
