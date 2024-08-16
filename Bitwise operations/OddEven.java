import java.util.Scanner;

class OddEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (isOdd(num)) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }
        in.close();
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}