public class BinaryAdd {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        int X = Integer.parseInt(a, 2);
        int Y = Integer.parseInt(b, 2);
        while (Y != 0) {
            int xor = X ^ Y;
            int carry = (X & Y) << 1;

            X = xor;
            Y = carry;

        }

        return Integer.toBinaryString(X);
    }
}
