package Recurrsion;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        seq("", "abc");
        System.out.println(seqRet("", "abc"));
    }

    public static void seq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char C = up.charAt(0);
        seq(p + C, up.substring(1));
        seq(p, up.substring(1));
    }

    public static ArrayList<String> seqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char C = up.charAt(0);
        ArrayList<String> left = seqRet(p + C, up.substring(1));
        ArrayList<String> right = seqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
