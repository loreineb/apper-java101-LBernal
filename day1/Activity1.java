import java.util.Scanner;
import java.util.Random;

class FlamesHope {

    public static void main(String[] args) {
        System.out.println("Welcome to FlamesHope!");

        Scanner myScanner = new Scanner(System.in);

        // TODO read https://www.w3schools.com/java/java_ref_string.asp
        // TODO read https://www.w3schools.com/java/java_conditions.asp
        
        // TODO allow user to enter his/her name
        System.out.print("What's your name: ");
        String name = myScanner.nextLine();

        // ITEM#1: Check if name is not empty. If empty, display "Your name is required." then the program should terminate
        if (name.isEmpty() == true) {
            System.out.print("Your name is required.");
            return;
        }

        // TODO allow user to enter his/her crush's name
        System.out.print("What's your crush's name: ");
        String crushName = myScanner.nextLine();

        // ITEM#2: Check if crushName is not empty. If empty, display "Your crushName is required."  then the program should terminate
         if (crushName.isEmpty() == true) {
            System.out.print("Your crushName is required.");
            return;
        }

        int nameLength = name.length(); // ITEM#3 get length of name
        int crushNameLength = crushName.length(); // ITEM#4 get length of crushName
        int result = result(nameLength, crushNameLength);

        // TODO display result.
        System.out.println("Your compatibility result: " + result);

        // ITEM#5 if result is less than 50, display "SAD :( ", else display name and crush name with <3 E.g "Orvyl and JY is <3"
        if (result < 50) {
            System.out.print("SAD :( ");
        } else {System.out.print(name and crushName is <3");
        }
    }

    static int result(int nameLength, int crushNameLength) {
        int total = nameLength + crushNameLength;
        Random random = new Random();
        return random.nextInt(total - 1) + 1;
    }

}
