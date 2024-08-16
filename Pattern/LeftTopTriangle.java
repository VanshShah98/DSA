package Pattern;

public class LeftTopTriangle {
    public static void main(String[] args) {
        LeftTop(4, 0);
    }

    public static void LeftTop(int r, int c) {
        if (r == 0) {
            return;
        } else {

            if (c < r) {
                System.out.print("*" + "   ");
                LeftTop(r, c + 1);
            } else {
                System.out.println();
                LeftTop(r - 1, 0);
            }

        }
    }
}
