/*
 8. Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.
 */
public class StringtoInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("-1337c0d3"));
    }

    public static int myAtoi(String s) {
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

        return (int) (val * flag);
    }

}
