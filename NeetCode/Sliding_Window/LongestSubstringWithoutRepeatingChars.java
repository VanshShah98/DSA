package NeetCode.Sliding_Window;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndex = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            if (charIndex.containsKey(s.charAt(right))) {
                left = Math.max(left, charIndex.get(s.charAt(right)) + 1);
            }

            charIndex.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
