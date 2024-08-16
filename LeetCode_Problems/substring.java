// import java.util.ArrayList;

/**
 * substring
 */
public class substring {

    public static void main(String[] args) {
        String n = "acfgbd";
        System.out.println(longestIdealString2(n, 2));

    }

    public static int longestIdealString(String s, int k) {

        int n = s.length();
        int[] dp = new int[n]; // dp[i] represents the length of the longest ideal string ending at index i

        for (int i = 0; i < n; i++) {
            int maxLen = 0;
            for (int j = 0; j < i; j++) {
                // Check if the condition for an ideal string is satisfied
                if (Math.abs(s.charAt(i) - s.charAt(j)) <= k) {
                    maxLen = Math.max(maxLen, dp[j]);
                }
            }
            dp[i] = maxLen + 1;
        }

        int maxLength = 0;
        for (int len : dp) {
            maxLength = Math.max(maxLength, len);
        }

        return maxLength;
    }

    public static int longestIdealString2(String s, int k) {
        int n = s.length();
        int count = 1; // Initialize count to 1 since any string of length 1 is ideal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) - s.charAt(j) <= k) {
                    count++;
                }
            }
        }

        return count;
    }

}