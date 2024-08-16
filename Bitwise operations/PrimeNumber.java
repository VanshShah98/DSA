import java.util.Scanner;

public class PrimeNumber {
    public static boolean Prime(int number) {
        int flag = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = 1;
            } else {
                flag = 0;
            }
        }

        if (flag == 1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = in.nextInt();
        in.close();
        if (Prime(n)) {
            System.out.print(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number");
        }

    }
}
