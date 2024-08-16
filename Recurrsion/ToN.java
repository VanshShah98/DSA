package Recurrsion;

public class ToN {
    public static void main(String[] args) {
        N(5);
    }

    public static void N(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        N(n - 1);
        System.out.println(n);
    }
}
