import java.util.Scanner;

public class SOE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the End Range number:");
        int n = in.nextInt();
        in.close();
        boolean[] primes = new boolean[n + 1];
        // System.out.println(primes[5]);
        Seive(n, primes);
    }

    public static void Seive(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
