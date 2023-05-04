import java.util.*;

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


