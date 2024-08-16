package Recurrsion;

public class reversenumber {
    public static void main(String[] args) {
        rev(2649);
        System.out.println(sum);
    }

    static int sum = 0;

    public static void rev(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);
    }
}
