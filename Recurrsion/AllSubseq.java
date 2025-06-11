package Recurrsion;

import java.util.HashSet;

public class AllSubseq {
    public static void subseq(int idx,String input,String newString,HashSet<String>occ){
        if(idx==input.length()){
            if(occ.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                occ.add(newString);
                return;
            }
        }
        char currChar= input.charAt(idx);
        //to be 
        subseq(idx+1, input, newString+currChar,occ);

        // to not to be
        subseq(idx+1, input, newString,occ);
    }
    public static void main(String[] args) {
        String input ="aaa";
        HashSet<String> set = new HashSet<>();
        subseq(0, input, "",set);
    }
}
