import java.util.Scanner;
public class Main {
    public static void PrimeNumber(){
        Scanner myScanner = new Scanner(System.in);
        int input = myScanner.nextInt();
        //System.out.println(input);

        boolean prime = true;
        int i = 2;
        if(input>1){
            while(i <= input/2){ //there can't be factors from input/2 to input
                if (input % i == 0){
                    prime = false;
                    break;
                }
                i++;
            }
        } else { //this else statement is used with if(input>1) to ensure that if 0 or 1 is entered, it will not be a prime number
            prime = false;
        }
        System.out.println(prime);
    }
    public static void main(String[] args) {
        PrimeNumber();
        }
}
