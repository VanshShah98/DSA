package ImpAlgos;

import java.util.Scanner;

public class NewtonSQRT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for square root:");
        double num = in.nextDouble();
        in.close();
        // tolerance to 1e-10
        System.out.println(SQRT(num));

    }

    public static double SQRT(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.0000000000000000000001) {
                break;
            }
            x = root;

        }

        return root;

    }
}