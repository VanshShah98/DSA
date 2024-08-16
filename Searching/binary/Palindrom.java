import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = in.nextLine();
        char[] b = a.toCharArray();
        Pal(b);
        System.out.println(Pal(b));
        in.close();
    }

    static boolean Pal(char[] arr) {
        int s = 0;
        int end = arr.length - 1;
        while (s != end) {
            if (arr[s] == arr[end]) {
                return true;
            }
            s++;
            end--;

        }
        return false;
    }

}
