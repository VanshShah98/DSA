import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhnPad {
    public static void main(String[] args) {
        letterCombinations("12");
    }

    public static List<String> letterCombinations(String digits) {
        // System.out.println(digits);
        List<String> res = new ArrayList<>();
        HashMap<Integer, String> keypad = new HashMap<>();
        keypad.put(2, "abc");
        keypad.put(3, "def");
        keypad.put(4, "ghi");
        keypad.put(5, "jkl");
        keypad.put(6, "mno");
        keypad.put(7, "pqrs");
        keypad.put(8, "tuv");
        keypad.put(9, "wxyz");
        permutationList(" ", digits, keypad);

        return res;
    }

    public static void permutationList(String p, String up, HashMap<Integer, String> keypad) {
        int dig = up.charAt(0) - '0';
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        String fi = new String(keypad.get(dig));

        // to be continued

    }
}
