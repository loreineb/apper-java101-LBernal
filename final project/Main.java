import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, User> userBalance = new HashMap<>();
        //in a HashMap: keys cannot have duplicates, but value can have
        //Users are saved on a Map being the Mobile number as the key and the User as the value.
        //put existing users into HashMap

        User u1 = new shareALoadUser("Bob", 100);
        User u2 = new shareALoadUser("Marley", 100);
        User u3 = new shareALoadUser("Seth", 100);
        User u4 = new shareALoadUser("Ryan", 100);
        User u5 = new shareALoadUser("Fritz", 100);

        userBalance.put("09175861661", u1);
        userBalance.put("09175861662", u2);
        userBalance.put("09175861663", u3);
        userBalance.put("09175861664", u4);
        userBalance.put("09175861665", u5);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Share-a-Load!");
        menu(userBalance, myScanner);
        printUserBalance(userBalance);
    }

    public static void menu(Map<String, User> userBalance, Scanner myScanner){
        System.out.println("Would you like to register as a user or share to an existing user? Enter 1 to register and 2 to share. Press any other key to stop transactions.");

        String answer = myScanner.next();
        if (answer.equals("1")){ //not answer == "1"
            register(userBalance,myScanner);
            //System.out.println("If you would like to register another user, enter 1. If you would like to send load, enter 2.");
        } else if (answer.equals("2")) {
            shareCheck(userBalance, myScanner);
        } else{
            System.out.println("Thank you for transacting with us! Have a great day!");
            return;
        }

        System.out.println("\nDo you have further transactions?");
        menu(userBalance, myScanner);

        myScanner.close();
    }
    public static void register(Map<String, User> userBalance, Scanner myScanner) {
        System.out.println("Please enter your name: ");
        String name = myScanner.next();
        boolean checkletter = name.matches("[a-zA-Z]+"); //this is better than doing a for loop

        System.out.println("Please enter your mobile number: ");
        String number = myScanner.next();
        //regarding number's data type: int is too konti, and long, when printed, does not display the 0 at the start of phone numbers
        boolean checknumber = number.matches("\\d+");
        int numlength = number.length();
        //System.out.println(name + " " + number);

        if (checkletter && checknumber && !name.isEmpty() && !number.isEmpty() && numlength == 11) {
            if (userBalance.containsKey(number)) {
                System.out.println("This number is already registered.");
            } else {
                User newUser = new shareALoadUser(name, 100);
                userBalance.put(number, newUser);
                //no need to put checkletter == true kasi by default it's true naman
                //better din to use name.isEmpty() rather than name == null
                System.out.println("Registration successful.");
            }
        } else if (name.isEmpty()) {
            System.out.println("You did not enter a name. Registration unsuccessful.");
        } else if (!checkletter) {
            System.out.println("Your input is invalid. Please enter a name consisting of only letters and no special characters. Registration unsuccessful.");
        } else if (number.isEmpty()) {
            System.out.println("You did not enter a number. Registration unsuccessful.");
        } else if (!checknumber) {
            System.out.println("Your input is invalid. Please enter a number consisting of only numbers. Registration unsuccessful.");
        } else if (numlength != 11) {
            System.out.println("Your input is invalid. Please enter a number with 11 digits. Registration unsuccessful.");
        }

    }

    public static void shareCheck(Map<String, User> userBalance, Scanner myScanner) {
        System.out.println("Please enter your number: ");
        String sendernum = myScanner.next();
        if (userBalance.containsKey(sendernum)) {
            System.out.println("Please enter the number you want to send to: ");
            String recipientnum = myScanner.next();

            if (userBalance.containsKey(recipientnum) && !recipientnum.equals(sendernum)) {
                System.out.println("Please enter how much you want to send: ");

                if (myScanner.hasNextDouble()) {
                    double amount = myScanner.nextDouble();
                    User sender = userBalance.get(sendernum);
                    User recipient = userBalance.get(recipientnum);
                    shareBalance(sender, recipient, amount);
                } else {
                    System.out.println("Send unsuccessful: The amount you entered is not a valid number. Kindly try again, thank you!");
                }
            } else {
                System.out.println("Send unsuccessful: The number you want to send to is not yet registered or you entered the same number. Kindly try again, thank you!");
            }
        } else {
            System.out.println("Send unsuccessful: Your number is not yet registered. Kindly register and try again, thank you!");
        }
    }
    public static void shareBalance(User sender, User recipient, double amount){
        if (sender.getBalance() >= amount){
            sender.setBalance(sender.getBalance() - amount);
            recipient.setBalance(recipient.getBalance() + amount);
            System.out.println("Your new balance is: " + sender.getBalance() + " Thank you for transacting with us!");
        } else {
            System.out.println("Your load is insufficient to make this transaction. Your current load is: " + sender.getBalance());
        }

    }

    public static void printUserBalance(Map<String, User> userBalance){
        System.out.println("\nUser Balance");
        for (Map.Entry<String, User> entry : userBalance.entrySet()){
            String number = entry.getKey();
            User user = entry.getValue();
            System.out.println("User: " + user.getName() + " with registered number: " + number + " has balance: " + user.getBalance());
        }
    }
}

interface User {
    //an interface is a template or an outline for a class
    //everything in the interface has to be in the class
    //@Override keeps track of what you're implementing from the interface

    double getBalance();
    void setBalance(double balance); //does not have a body talaga, like alam mo lang na a user shares balances ganun

    String getName();
}

class shareALoadUser implements User { //when you implement an interface dapat gamitin mo lahat nung asa interface
    private String name;
    private double balance;

    public shareALoadUser(String name, double balance){
        this.name = name;
        this.balance = balance; 
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName(){
        return name;
    }
}
