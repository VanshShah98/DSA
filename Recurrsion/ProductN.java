package Recurrsion;

public class ProductN {
    public static void main(String[] args) {
        System.out.println(fact(9));
    }

    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }

        // System.out.println(n * fact(n - 1));
        return n * fact(n - 1);

    }
}
