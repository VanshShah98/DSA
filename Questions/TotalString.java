package Questions;

public class TotalString {
    public static void main(String[] args) {
        System.out.println(total("a"));
    }

    public static int total(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sum = ch + 0;
        }
        return sum;
    }
}
