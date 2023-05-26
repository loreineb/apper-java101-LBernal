import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, User> userBalance = new HashMap<>();
        //in a HashMap: keys cannot have duplicates, but value can have
        //Users are saved on a Map being the Mobile number as the key and the User as the value
        //rather than <String, String> you do <String, User> para you can have balance

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
        System.out.println("Would you like to register as a user or share to an existing user? Enter 1 to register and 2 to share. Enter any other key to stop transactions.");

        String answer = myScanner.nextLine();
        if (answer.equals("1")){ //not answer == "1"
            register(userBalance,myScanner);
        } else if (answer.equals("2")) {
            shareCheck(userBalance, myScanner);
        } else{
            System.out.println("Thank you for transacting with us! Have a great day!");
            return; //need to put this or else di matatapos
        }

        System.out.println("\nDo you have further transactions?");
        menu(userBalance, myScanner);

        //myScanner.close();
    }
    public static void register(Map<String, User> userBalance, Scanner myScanner) {
        System.out.println("Please enter your name: ");
        String name = myScanner.nextLine(); //changed myScanner.next to .nextLine para tumigil siya
        boolean checkletter = name.matches("[a-zA-Z]+"); //this is better than doing a for loop
        //regex stands for regular expression
        if (name.isEmpty()){
            System.out.println("Registration unsuccessful: You did not enter a name.");
            return;
        } else if (!checkletter) {
            System.out.println("Registration unsuccessful: Your input is invalid. Please enter a name consisting of only letters and no special characters.");
            return;
        }

        System.out.println("Please enter your mobile number: ");
        //myScanner.nextLine(); //you need this kasi nung una wala toh and nagskiskip siya so is this to "consume" the newline
        String number = myScanner.nextLine();
        boolean checknumber = number.matches("\\d+");
        int numlength = number.length();

        //regarding number's data type: int is too konti, and long, when printed, does not display the 0 at the start of phone numbers
        if (number.isEmpty()){
            System.out.println("Registration unsuccessful: You did not enter a number.");
            return;
        } else if (!checknumber) {
            System.out.println("Registration unsuccessful: Your input is invalid. Please enter a number consisting of only numbers.");
        } else if (numlength != 11) {
            System.out.println("Registration unsuccessful: Your input is invalid. Please enter a number with 11 digits.");
        }


        if (checkletter && checknumber && numlength == 11) {
            if (userBalance.containsKey(number)) {
                System.out.println("Registration unsuccessful: This number is already registered. Kindly try again.");
            } else {
                User newUser = new shareALoadUser(name, 100);
                userBalance.put(number, newUser);
                //no need to put checkletter == true kasi by default it's true naman -> boolean
                //better din to use name.isEmpty() rather than name == null
                System.out.println("Registration successful for: " + name + " with number: " + number);
            }
        }
    }
    public static void shareCheck(Map<String, User> userBalance, Scanner myScanner) {
        System.out.println("Please enter your number: ");
        String sendernum = myScanner.nextLine();
        if (userBalance.containsKey(sendernum)) {
            System.out.println("Please enter the number you want to send to: ");
            String recipientnum = myScanner.nextLine();

            if (userBalance.containsKey(recipientnum) && !recipientnum.equals(sendernum)) {
                System.out.println("Please enter how much you want to send: ");
                String amount = myScanner.nextLine();
                try { //was going for an if statement at first, pero parang try + catch is easier?
                    double dAmount = Double.valueOf(amount);
                    User sender = userBalance.get(sendernum);
                    User recipient = userBalance.get(recipientnum);
                    shareBalance(sender, recipient, dAmount);
                    //so sa try it's going to run all the code tapos pag nagka exception, ibabato sa catch

                } catch (NumberFormatException e){
                    //NumberFormatException "catches" those na hindi pwede maging double, so huli niya yung mga input na di number
                    //the e here is yung exception mismo
                    System.out.println("Send unsuccessful: The amount you entered is not a valid number. Kindly try again, thank you!");
                }
            } else {
                System.out.println("Send unsuccessful: The number you want to send to is either not yet registered or invalid, or you entered the same number. Kindly try again, thank you!");
            }
        } else {
            System.out.println("Send unsuccessful: Your number is either invalid or not yet registered. Kindly register and try again, thank you!");
        }
    }

    public static void shareBalance(User sender, User recipient, double dAmount){
        if (sender.getBalance() >= dAmount){
            String pangalan = recipient.getName();
            String censoredname = pangalan.replaceAll("[aeiourst]", "*");
            System.out.println("You are sending to: " + censoredname + "\nIf you wish to proceed, enter 1. Enter any other key to stop share transaction.");

            Scanner myScanner = new Scanner(System.in);
            String answer = myScanner.next();
            if (answer.equals("1")) {
                sender.setBalance(sender.getBalance() - dAmount);
                recipient.setBalance(recipient.getBalance() + dAmount);
                System.out.println("Send successful: Your new balance is: " + sender.getBalance() + " Thank you for transacting with us!");
            } else {
                System.out.println("You have selected to stop the share transaction.");
            }
        } else {
            System.out.println("Send unsuccessful: Your load is insufficient to make this transaction. Your current load is: " + sender.getBalance());
        }
    }

    public static void printUserBalance(Map<String, User> userBalance){ //para mas maganda output
        System.out.println("\nUser Balance");
        for (Map.Entry<String, User> entry : userBalance.entrySet()){ //entrySet is to access the keypair
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
        this.balance = balance; //you put this para lang alam niya which you're referring to kasi same ng name
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
