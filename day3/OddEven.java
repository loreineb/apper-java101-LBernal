import java.util.*;

public class Main {
    public static void main(String[] args) {

        //int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};
        //isOddEven(nums);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("This code will show you the number of odd and even numbers in a set. Kindly input whole integers separated by spaces.");

        String input = myScanner.nextLine();
        String[] separated = input.split("\\s+"); //" " might default to something else, so use the regular expression for whitespace which is \\s+

        Set<Integer> mySetNum= new HashSet<>();
        Set<String> mySetNotNum= new HashSet<>();

        for (String x : separated) {
            try {
                int myNum = Integer.parseInt(x);
                mySetNum.add(myNum);
            } catch (NumberFormatException e){ //for the scenario that letters or decimals are inputted
                mySetNotNum.add(x);
            }
        }
        if (mySetNotNum.isEmpty()) {
            ; //do nothing because I only want to print invalid inputs if there are any in the first place
        } else {
            System.out.println("The following inputs are not whole numbers and will be disregarded: " + mySetNotNum);
        }
        System.out.println(mySetNum);
        //isOddEven(mySetNum); //for checking
    }
    public static void isOddEven(Set<Integer> set){
    //public static void isOddEven(int[] arr){ //made static para no need to create an instance
        int odd = 0;
        int even = 0;
        //for (int x: arr)
        for (int x : set) {
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
