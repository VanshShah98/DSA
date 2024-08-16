package Recurrsion;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println("Product" + " " + Product(13572));
        System.out.println("Sum" + " " + sum(13572));
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        // System.out.println(n % 10 + " ");
        return (n % 10) + sum(n / 10);
    }

    public static int Product(int n) {
        if (n == 1) {
            return 1;
        }
        // System.out.println(n % 10 + " ");
        return (n % 10) * Product(n / 10);
    }
}
