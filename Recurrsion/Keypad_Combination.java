package Recurrsion;

import java.util.ArrayList;
import java.util.List;


public class Keypad_Combination {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;

        String[] keyMap = new String[]{
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        StringBuilder combination = new StringBuilder();
        backtrack(0, digits, keyMap, combination, res);
        return res;
    }

    private static void backtrack(int idx, String digits, String[] keyMap, StringBuilder combination, List<String> res) {
        if (idx == digits.length()) {
            res.add(combination.toString());
            return;
        }

        String letters = keyMap[digits.charAt(idx) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            combination.append(letters.charAt(i));
            backtrack(idx + 1, digits, keyMap, combination, res);
            combination.deleteCharAt(combination.length() - 1); // backtrack
        }
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
