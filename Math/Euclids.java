package Math;

public class Euclids {
    public static void main(String[] args) {
        System.out.println(LCM(3, 7));
    }

    public static int GCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return GCD(b % a, a);
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
