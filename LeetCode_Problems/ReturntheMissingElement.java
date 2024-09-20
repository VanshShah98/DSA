import java.util.HashMap;

public class ReturntheMissingElement {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "abcde";
        System.out.println(findMissingElement(str1, str2));
    }

    public static char findMissingElement(String longer, String shorter) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character in the longer string
        for (char c : longer.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrease frequency for characters found in the shorter string
        for (char c : shorter.toCharArray()) {
            charCount.put(c, charCount.get(c) - 1);
        }

        // The character with frequency still 1 is the missing character
        for (char c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        // Return null character if nothing is missing
        return '\0';
    }
}
