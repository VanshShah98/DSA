package Recurrsion;

public class CountZero {

    static int count = 0;

    public static void checkZero(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        if (rem == 0) {
            count++;
        }
        checkZero(n / 10);
    }

    public static void main(String[] args) {
        checkZero(500030206);
        System.out.println(count);
    }
}
