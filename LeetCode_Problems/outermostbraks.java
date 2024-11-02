public class outermostbraks {
    public static void main(String[] args) {
        String s = "(()())(())";
        removeOuterParentheses(s);
    }

    public static String removeOuterParentheses(String s) {
        // String[] arr = s.split(s);
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < str.length() - 1; i++) {
            if (s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
                System.out.println("i am in condition");
                continue;
            } else {
                System.out.println("i am in else condition : " + i);
                str.deleteCharAt(i);
            }
        }
        System.out.println(str);
        return s;
    }
}
