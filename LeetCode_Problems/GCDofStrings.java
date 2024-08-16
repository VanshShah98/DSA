import java.util.ArrayList;

public class GCDofStrings {
    public static void main(String[] args) {
        String s1 = "ABCABCABC";
        String s2 = "ABCABC";
        System.out.println(gcdOfStrings(s1, s2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        ArrayList<Character> ans = new ArrayList<Character>(str2.length());
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (str2.charAt(i) != str2.charAt(j)) {
                    ans.add(str2.charAt(i));
                } else {
                    break;
                }
            }
        }

        return ans.toString();
    }
}
