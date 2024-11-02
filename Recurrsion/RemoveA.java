package Recurrsion;

public class RemoveA {
    public static void main(String[] args) {
        skip("", "abcdefghijklmnopqrstuvwxyzaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    public static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char C = up.charAt(0);
        if (C == 'a' || C == 'b') {
            skip(p, up.substring(1));
        } else {
            skip(p + C, up.substring(1));
        }

    }

}
