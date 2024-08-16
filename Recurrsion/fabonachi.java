package Recurrsion;

import java.util.Scanner;

public class fabonachi {
    public static void main(String[] args) {
        int pt = 0;
        int ct = 1;
        int nt = 0;
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(seq(target, pt, ct, nt));
        in.close();
    }

    static int[][] seq(int target, int pt, int ct, int nt) {
        if (nt == target) {
            // return new int[] arr[nt];
        }
        nt = ct + pt;
        ct = pt;
        pt = nt;

        return seq(target, pt, ct, nt);

    }
}
