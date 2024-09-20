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
/*
 3. *****
    ****
    ***
    **
    *
 */
/*
  4.1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */
/*
  5.*
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */
/*
  8.    *
       ***
      *****
     *******
    *********
 */

import java.util.Scanner;

class Pattern1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of row :");
        int n = in.nextInt();
        in.close();
        pattern5(n);

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

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern4(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }

}