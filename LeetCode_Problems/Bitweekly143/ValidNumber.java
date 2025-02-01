package Bitweekly143;

import java.util.HashMap;

public class ValidNumber {
    public static void main(String[] args) {
        String input = "22"; // Example input
        
        String result = findFirstValidPair(input);
        System.out.println("First valid pair: " + result);
    }
    
    public static String findFirstValidPair(String input) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each digit
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
        }
        
        // Find first valid pair
        for (int i = 0; i < input.length() - 1; i++) {
            char first = input.charAt(i);
            char second = input.charAt(i + 1);
            
            if (first != second && countMap.get(first) == Character.getNumericValue(first) && countMap.get(second) == Character.getNumericValue(second)) {
                return "" + first + second;
            }
        }
        
        return "";
    }
}
