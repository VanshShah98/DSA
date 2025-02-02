package NeetCode.Array_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static  List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> res = new HashMap<>();
       for(String s : strs){
        char[] CharArray = s.toCharArray();
        Arrays.sort(CharArray);
        String b = new String(CharArray); 
        res.putIfAbsent(b, new ArrayList<>());
        res.get(b).add(s);
       }
       return new ArrayList<>(res.values());

    }
}
