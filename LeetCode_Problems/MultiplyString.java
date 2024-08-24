/*
    Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

    Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

import java.math.BigInteger;

public class MultiplyString {
    public static void main(String[] args) {
        String num1 = "6913259244";
        String num2 = "71103343";
        System.out.println(multiply2(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        return a.multiply(b) + "";
    }

    // Without Using BigInteger.
    public static long myAtoi(String s) {
        int i = 0;
        int flag = 1;
        long val = 0;
        s = s.trim();

        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            flag = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            val = val * 10 + (s.charAt(i) - '0');
            i++;

            if (val * flag > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (val * flag < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        System.out.println(val * flag);
        return (val * flag);
    }

    // Optimized Approch.
    public static String multiply2(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int m = num1.length(), n = num2.length();
        int[] arr = new int[m + n];
        for (int i = m - 1; i >= 0; --i) {
            int a = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; --j) {
                int b = num2.charAt(j) - '0';
                arr[i + j + 1] += a * b;
            }
        }
        for (int i = arr.length - 1; i > 0; --i) {
            arr[i - 1] += arr[i] / 10;
            arr[i] %= 10;
        }
        int i = arr[0] == 0 ? 1 : 0;
        StringBuilder ans = new StringBuilder();
        for (; i < arr.length; ++i) {
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}
