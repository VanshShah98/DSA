public class LongestString {
    public static void main(String[] args) {
        String str1 = "hello";
        lengthOfLongestSubstring(str1);
    }

    public static int lengthOfLongestSubstring(String s) {
        System.out.println(helper(s, 0, 0));
        return helper(s, 0, 0);
    }

    public static int helper(String s, int start, int count) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    start = j;
                    break;
                }

            }
            c++;
        }
        if (count < c) {
            count = c;
            helper(s, start, c);
        }
        return count;
    }

}
