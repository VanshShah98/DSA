package Recurrsion;

import java.util.ArrayList;

class permution {
    public static void main(String[] args) {
        premutation("", "abc");
        System.out.println();
        System.out.println(premutationLIST("", "0123456789"));
    }

    public static void premutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            premutation(first + ch + second, up.substring(1));
        }

    }

    public static ArrayList<String> premutationLIST(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(premutationLIST(first + ch + second, up.substring(1)));
        }
        return ans;
    }

}