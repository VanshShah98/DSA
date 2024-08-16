package Recurrsion;

import java.util.Scanner;

public class fabo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(seq(target));
        in.close();
    }

    static int seq(int n) {
        if (n < 2) {
            return n;
        }
        return seq(n - 1) + seq(n - 2);
    }
}
