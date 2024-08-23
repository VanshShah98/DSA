
/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If
 * reversing x causes the value to go outside the signed 32-bit integer range
 * [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or
 * unsigned).
 */
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse2(892320));
    }

    // Brute Force Approch but Fails test case when Int is overFlowed.
    public static int reverse(int x) {
        String num = Integer.toString(Math.abs(x));
        StringBuilder sb = new StringBuilder(num);
        sb.reverse();
        long reversedLong = Long.parseLong(sb.toString());
        if (reversedLong < Integer.MIN_VALUE || reversedLong > Integer.MAX_VALUE) {
            return 0;
        }
        if (x < 0) {
            reversedLong = -reversedLong;
        }

        return (int) reversedLong;
    }

    public static int reverse2(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            reversed = reversed * 10 + pop;
        }
        return reversed;
    }

    // Optimized.
    public int reverse3(int x) {
        long ans = 0;

        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }

        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
    }

}