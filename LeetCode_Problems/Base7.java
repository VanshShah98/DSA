public class Base7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7_2(-7));
    }

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

    public static String convertToBase7_2(int num) {
        return Integer.toString(num, 7);
    }

}
