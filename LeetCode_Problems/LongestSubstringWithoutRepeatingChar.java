public class LongestSubstringWithoutRepeatingChar {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int n = s.length();
        int rep = 0;
        int maxLength = 0;
        for (int end = 1; end < n; end++) {
            if (s.charAt(start) == s.charAt(end)) {
                rep++;
                start++;
                end = start + 1;
                System.out.println("Start when equal " + start);
            } else {
                System.out.println("Start : " + start);
                System.out.println("End : " + end);
                maxLength = Math.max(maxLength, end - start + 1);
                System.out.println("MaxLen : " + maxLength);
            }
            System.out.println("Pass : " + end);

        }
        System.out.println("rep " + rep);

        return (maxLength == 1 ? 1 : maxLength);
    }

    public static int lengthOfLongestSubstring2(String s) {
        int j = 0;
        int n = s.length();
        int maxLength = 0;
        for (int end = 0; end < n; end++) {
            for (int k = j; k < end; k++) {
                if (s.charAt(k) == s.charAt(end)) {
                    j = k + 1;
                }
            }
            maxLength = Math.max(maxLength, end - j + 1);

        }
        return maxLength;
    }

    public static int lengthOfLongestSubstring3(String s) {
        int n = s.length();
        int[] lastIndex = new int[128]; // Assuming ASCII character set
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1; // Initialize all positions to -1
        }

        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            // If the character is repeated, move the start pointer
            if (lastIndex[currentChar] >= start) {
                start = lastIndex[currentChar] + 1;
            }
            // Update the last index of the current character
            lastIndex[currentChar] = end;
            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    /*
     * int start = 0;
     * int n = s.length();
     * int maxLength = 1;
     * for (int end = 1; end < n; end++) {
     * while (s.charAt(start) != s.charAt(end)) {
     * maxLength = Math.max(maxLength, end - start + 1);
     * start++;
     * }
     * 
     * }
     * return (maxLength == 1 ? 1 : maxLength);
     */
    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLongestSubstring3(s));
    }
}
