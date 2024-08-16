public class Dividetwonumbers {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }

    public static int divide(long dividend, long divisor) {
        int ans = 0;
        long sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (divisor <= dividend) {
            dividend -= divisor;
            ans++;
        }

        if (sign == -1) {
            ans = -ans;
        }
        return ans;
    }
}
