package Pattern;

/*
1.  *****
    *****
    *****
    *****
    ***** 
*/
/*
 2. *
    **
    ***
    ****
    *****
 */

import java.util.Scanner;

class Pattern1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of row :");
        int n = in.nextInt();
        in.close();
        Pattern(n);

    }

    public static void Pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

}