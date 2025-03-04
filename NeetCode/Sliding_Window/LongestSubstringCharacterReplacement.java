package NeetCode.Sliding_Window;

import java.util.HashMap;

public class LongestSubstringCharacterReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }
    public static int characterReplacement(String s, int k) {
        int maxCount=0;
        int rep=k;
        int i=0;
        int j=i+1;
        while(j<s.length()){
            if(s.charAt(j)==s.charAt(i)){
                j++;
            }
            if(rep>0){
                if(s.charAt(j)!=s.charAt(i)){
                rep--;
                j++;
                }
            }
            maxCount=Math.max(maxCount, j-i+1);
            if(rep==0){
                i=j;
                j=i+1;
                rep=k;
            }
        }
        return maxCount;
    }



    ///I dont know How this works but it works
    public class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;

        int l = 0, maxf = 0;
        for (int r = 0; r < s.length(); r++) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, count.get(s.charAt(r)));

            while ((r - l + 1) - maxf > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
}
