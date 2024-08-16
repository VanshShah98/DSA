package Recurrsion;

import java.util.Scanner;

class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int n = sc.nextInt();
        System.out.println("Enter the ending number");
        int k = sc.nextInt();
        if (k < n) {
            System.out.println("Enter the End greater then Start");
        } else {
            print(n, k);
        }
        sc.close();
    }

    static void print(int n, int k) {

        if (n == k) {
            System.out.println(k);
            return;
        } else {
            System.out.println(n);
            n++;
            print(n, k);
        }
    }

    static void printrev(int n, int k) {

        if (n == k) {
            System.out.println(k);
            return;
        } else {
            System.out.println(n);
            n++;
            print(n, k);
        }
    }

}