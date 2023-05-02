import java.util.Scanner;

public class PrimeNumbersV2 {
    public static void main(String[] args) {
        // Input range: 1 - 10_000_000
        Scanner myScanner = new Scanner(System.in);
        System.out.println("This code returns true if the entered number is a prime number. Please enter a whole number from 1 to 10 million: ");
        if (myScanner.hasNextInt()){
            int input = myScanner.nextInt();
            if (input>=1 && input<=10000000) {
                long startTime = System.nanoTime();
                boolean result = isPrimeNumber(input);
                System.out.println(result);
                //I need to print the result, I had a problem with not getting any return values without this sout and initially resorted to souting in isPrimeNumber itself
                long endTime = System.nanoTime();
                System.out.println("Duration: " + (endTime - startTime) + "nanoseconds");
            } else {
                System.out.println("You entered a value not in the specified range.");
            }
        } else {
            System.out.println("What you entered was not a whole number.");
        }
        myScanner.close();
    }
    public static boolean isPrimeNumber(int input) {
        if(input<=1) { //1 is not considered a prime number
            //System.out.println("false");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(input); i++) { //more efficient to check only till sqrt, rather than to the half
            if (input % i == 0) { //if there is no remainder, it means there is a factor
                //System.out.println("false");
                return false;
            }
        }
        //System.out.println("true");
        return true;
    }
}
