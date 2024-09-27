public class isPoweroftwo {
    public static void main(String[] args) {

    }

    public boolean isPowerOfTwo(int n) {
        double pow = 1;
        double i = 0;
        while (pow <= n) {
            pow = Math.pow(2, i);
            if (pow == n) {
                return true;
            }
            i++;
        }
        return false;
    }
}
