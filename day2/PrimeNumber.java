import java.util.Scanner;

public class MyClass {
    public static void PrimeNumber() {
        System.out.println("Enter a whole number");
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();

        //must output TRUE if prime number
        if (number == 1){
            system.out.println(number != 1);
            else {
                for (int i=2; i < 10; i++){
                    if (number % i == 0) {
                        System.out.println(number != 1);
                    } else {
                        System.out.println(number == number);
                    }
                }
            }
        }
    }
  public static void main (String[] args) {
            MyClass();
        }
    }
