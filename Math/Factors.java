package Math;

import java.util.ArrayList;
import java.util.Scanner;

// Give an array of the factors of the given numbers.
public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        in.close();
        System.out.println(facts2(n));

    }

    public static ArrayList<Integer> facts(int n) {
        // brute force appoch
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        return answer;
    }

    public static ArrayList<Integer> facts2(int n) {
        // optimised appoch
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    answer.add(i);
                } else {
                    answer.add(i);
                    answer.add(n / i);
                }
            }
        }
        answer.sort((x, y) -> Integer.compare(x, y));
        return answer;
    }
}
