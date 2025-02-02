
package NeetCode.Array_Hashing;

import java.util.Arrays;
//Use HashTable for Optimal Code
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals( sChar,tChar );
    }
    
}