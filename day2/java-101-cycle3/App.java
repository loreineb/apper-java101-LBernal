public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //while loop: as long as the condition returns true, it will keep doing the code sa laman
        //while loop: NEEDS a terminator

        //do while loop: checks the condition at the end, nauna si do kesa kay while
        // GUARANTEED TO RUN ONCE
        // use cases: do while is usually used to check connections from one machine to another

        //while true: keep pinging ya

        //for is like while, pero mas meaningful: security na magteterminate and part sa () mismo yung condition to terminate

    }
}

public class OddEvenNumbers { //refactoring changes even the file name
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(isEven(6));
        System.out.println(isEven(7));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

//    public static boolean isEven(int num) {
//        boolean result = false;
//        int modResult = num % 2;
//
//        if (modResult == 0){ //boolean expression yung nasa loob ng IF
//            result = true;
//        }
//
//        return result;
//    }
    //HIGHLIGHT + CTRL + SLASH TO COMMENT OUT IN ONE GO
}

public class App {//if class is public, class name is kapangalan yung file name

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //numeric whole numbers (pwede +/-, basta bawal with decimal): short, int, long
        int age = 15;
        System.out.println(age);

        age = age + 10;
        System.out.println(age);

        long MyBalanceInGCash = 1000000000;
        long NewBalance= MyBalanceInGCash + age; //cannot be int NewBalance
        System.out.println(NewBalance);
        //you can highlight then right click, refactor, then introduce new variable

    //public static void allAboutStrings(){
            //Strings
            int number1 = 49;
            char number1char= '1'; //note the single quotes
            String number1string = "1"; //strings are an array of characters: ['1', ' ', ' ',....]; string is easier than an array of char

            String myName = "Loreine"; //use this
            char[] myNameArr = new char[]{'L', 'o', 'r', 'e', 'i', 'n', 'e'}; //over this
            System.out.println(myName);
            System.out.println(myName.toUpperCase());
            System.out.println(myName.toLowerCase());

            String completeName = "Loreine Bernal"; //ctrl + click to see manual
            System.out.println(completeName.substring(5,7));

            boolean isEqualName = myName.equals("loreine");
            boolean isEqualIgnoreCase = myName.equalsIgnoreCase("loreine");
            System.out.println(isEqualName + "  " + isEqualIgnoreCase);
        }

        public static void allAboutDecimals(int age){
            //decimal: double and float (double is bigger than float)
            double price = 4.45;
            double NewPrice = price + age; //can add price and age because they're still in the same family of number data types
            System.out.println(NewPrice);

            float discount = 9.56f; //need to put an f at the end if float to differentiate from double
            double subtotal = discount + price;
            float test = discount + age; //no need to put f at the end, it seems
            System.out.println(subtotal);
            System.out.println(test);
        }

    }


