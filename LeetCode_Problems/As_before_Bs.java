public class As_before_Bs {
    /*
     * Given a string s consisting of only the characters 'a' and 'b', return true
     * if every 'a' appears before every 'b' in the string. Otherwise, return false.
     */
    public static void main(String[] args) {
        String s = "";
        System.out.println(checkString(s));
    }

    public static boolean checkString(String s) {
        int b = 0;
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                b = i;
                break;
            } else {
                a++;
            }
        }
        if (a == s.length()) {
            return true;
        }
        for (int j = b; j < s.length(); j++) {
            if (s.charAt(j) == 'a') {
                return false;
            }
        }

        return true;
    }
}
