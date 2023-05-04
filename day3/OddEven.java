import java.util.*;

//version that can take input
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("This code will show you the number of odd and even numbers in a set. Kindly input whole integers separated by spaces.");
//
//        String input = myScanner.nextLine();
//        String[] separated = input.split("\\s+"); //" " might default to something else, so use the regular expression for whitespace which is \\s+
//
//        List<Integer> myNumbers = new ArrayList<>();
//        List<String> myNotNumbers = new ArrayList<>();
//
//        for (String x : separated) {
//            try {
//                int myNum = Integer.parseInt(x);
//                myNumbers.add(myNum);
//            } catch (NumberFormatException e){ //to account for entries that aren't whole numbers
//                myNotNumbers.add(x);
//            }
//        }
//        if (myNotNumbers.isEmpty()) {
//            ; //do nothing because I only want to print invalid inputs if there are any in the first place
//        } else {
//            System.out.println("The following inputs are not whole numbers and will be disregarded: " + myNotNumbers);
//        }
//        //System.out.println(myNumbers); //for testing
//        isOddEven(myNumbers);
//    }
//    public static void isOddEven(List<Integer> list){
//        int odd = 0;
//        int even = 0;
//
//        List<Integer> OddList = new ArrayList<>();
//        List<Integer> EvenList = new ArrayList<>();
//
//        for (int x : list) {
//            if (x % 2 == 0){
//                EvenList.add(x);
//                even++;
//            } else {
//                OddList.add(x);
//                odd++;
//            }
//        }
//        if (OddList.isEmpty()){
//            System.out.println("You didn't enter any odd numbers.");
//        } else {
//            System.out.println("You entered " + odd + " odd number/s. These are: " + OddList);
//        }
//
//        if (EvenList.isEmpty()){
//            System.out.println("You didn't enter any even numbers.");
//        } else {
//            System.out.println("You entered " + even + " even number/s. These are: " + EvenList);
//        }
//
//    }
//}

//version that can't take input
public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};
        //int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //additional testing
        isOddEven(nums);
    }
    public static void isOddEven(int[] arr){ //made static para no need to create an instance
        int odd = 0;
        int even = 0;
        for (int x : arr) {
            if (x % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
}
