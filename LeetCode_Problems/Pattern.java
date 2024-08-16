import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = in.nextInt();
        System.out.println("Enter the Sr.No of the pattern you want to print: ");
        int a = in.nextInt();
        switch (a) {
            case 1:
                Pattern1(rows);/*
                                *****
                                *****
                                *****
                                *****
                                */
                break;
            case 2:
                Pattern2(rows); /*  
                                    *
                                    **
                                    ***
                                    ****
                                    ***** 
                                */
                break;
            case 3:
                Pattern3(rows);/*
                                *****
                                ****
                                ***
                                **
                                *
                               */
                break;
            case 4:
                Pattern4(rows);/*
                                * 1
                                * 1 2
                                * 1 2 3
                                * 1 2 3 4
                                * 1 2 3 4 5
                                */
                break;
            case 5:
                Pattern5(rows);/*
                                    *
                                    **
                                    ***
                                    ****
                                    *****
                                    ****
                                    ***
                                    **
                                    *
                                */
                break;
            case 6:
                Pattern6(rows);
                break;
            case 7:
                Pattern1(rows);
                break;
            case 8:
                Pattern1(rows);
                break;
            case 9:
                Pattern1(rows);
                break;
            case 10:
                Pattern1(rows);
                break;
            case 11:
                Pattern1(rows);
                break;
            case 12:
                Pattern1(rows);
                break;

            case 13:
                Pattern1(rows);
                break;

            case 14:
                Pattern1(rows);
                break;
            case 15:
                Pattern1(rows);
                break;
            case 16:
                Pattern1(rows);
                break;
            case 17:
                Pattern1(rows);
                break;
            case 18:
                Pattern1(rows);
                break;
            case 19:
                Pattern1(rows);
                break;
            case 20:
                Pattern1(rows);
                break;
            case 21:
                Pattern1(rows);
                break;
            case 22:
                Pattern1(rows);
                break;
            case 23:
                Pattern1(rows);
                break;
            case 24:
                Pattern1(rows);
                break;

            case 25:
                Pattern1(rows);
                break;
            case 26:
                Pattern1(rows);
                break;
            case 27:
                Pattern1(rows);
                break;
            case 28:
                Pattern1(rows);
                break;
            case 29:
                Pattern1(rows);
                break;
            case 30:
                Pattern1(rows);
                break;
            case 31:
                Pattern1(rows);
                break;

        }
        in.close();

    }

    static void Pattern1(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern2(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        for (int rows = n; rows >= 1; rows--) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        for (int rows = 1; rows <= n - 1; rows++) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int rows = n; rows >= 1; rows--) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n) {// start from here.
        for (int rows = n; rows >= 1; rows--) {
            for (int col = 1; col <= rows; col++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
