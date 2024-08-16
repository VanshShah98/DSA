package Questions;

import java.util.Scanner;

//Finding the sqrt of a number using binary search.
public class Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the persision upto which u want ur sqrt to be:");
        int n = in.nextInt();
        // System.out.println("Find the SQRT of :");
        // int num = in.nextInt();
        in.close();
        System.out.println(isPalindrome(n));
    }

    public static double sqrt(int num, int n) {
        int start = 0;
        int end = num;
        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < n; i++) {
            while (root * root <= num) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }
        return root;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int revnum = 0;
        int To = x;
        while (To != 0) {
            int lastDigit = To % 10;
            revnum = revnum * 10 + lastDigit;
            To = To / 10;
        }
        if (revnum == x) {
            return true;
        } else {
            return false;
        }

    }
}
