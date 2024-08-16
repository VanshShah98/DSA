import java.util.Scanner;

class Seat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(k + " ");
                    k = k + 2;
                } else {
                    System.out.print(j * 2 + " ");
                    k = 1;
                }
            }
            System.out.println();
        }
    }
}