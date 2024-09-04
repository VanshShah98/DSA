import java.util.ArrayList;

/**
 * You are given a binary string s and an integer k.
 * 
 * A binary string satisfies the k-constraint if either of the following
 * conditions holds:
 * 
 * The number of 0's in the string is at most k.
 * The number of 1's in the string is at most k.
 * Return an integer denoting the number of
 * substrings of s that satisfy the k-constraint.
 */
public class CountSubstringsThatSatisfyKConstraint {
    public static void main(String[] args) {
        String s = "011111101101111001010000001010";
        System.out.println(countKConstraintSubstrings2(s, 7));
    }

    // Brute Force
    public static int countKConstraintSubstrings(String s, int k) {
        ArrayList<String> Subs = PossilbeSubstring(s);
        System.out.println(" Subs :" + Subs);
        int TotalString = 0;
        for (int i = 0; i < Subs.size(); i++) {
            String a = Subs.get(i);
            int j = 0;
            int onecount = 0;
            int zerocount = 0;
            while (j < a.length()) {
                System.out.println("I am in the Loop");
                if (a.charAt(j) == '1') {
                    onecount++;
                    j++;
                } else if (a.charAt(j) == '0') {
                    zerocount++;
                    j++;
                }
                if ((onecount <= k || zerocount <= k) && j == a.length()) {
                    TotalString++;
                }
            }

        }

        return TotalString;
    }

    public static ArrayList<String> PossilbeSubstring(String s) {
        ArrayList<String> Subs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                Subs.add(s.substring(i, j));
            }
        }
        return Subs;
    }

    // Optimized
    public static int countKConstraintSubstrings2(String s, int k) {
        int ones = 0, zeroes = 0;
        int count = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '0') {
                ++zeroes;
            } else {
                ++ones;
            }
            while (ones > k && zeroes > k) {
                if (s.charAt(left) == '0') {
                    --zeroes;
                } else {
                    --ones;
                }
                ++left;
            }
            count += (right - left + 1);
        }
        return count;
    }
}