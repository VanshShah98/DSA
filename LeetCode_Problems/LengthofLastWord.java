
public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord2(s));
    }

    public static int lengthOfLastWord(String s) {
        s.strip();
        String[] arrOfStr = s.split(" ");
        return arrOfStr[arrOfStr.length - 1].length();
    }

    public static int lengthOfLastWord2(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
