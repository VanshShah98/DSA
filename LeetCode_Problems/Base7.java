/*
 * Q504. Given an integer num, return a string of its base 7 representation.
 */
public class Base7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7_2(-7));
    }

    // Without using Integer.
    public static String convertToBase7(int num) {
        if (num < 0) {
            return "-" + convertToBase7(-num);
        }
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 7);
            num = num / 7;
        }

        return sb.reverse().toString();
    }

    // Using Java Integer
    public static String convertToBase7_2(int num) {
        return Integer.toString(num, 7);
    }

}
