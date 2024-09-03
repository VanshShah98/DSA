/*Given a number N. Find the length of the longest consecutive 1s in its binary representation. */
public class Longest1s {
    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(927));
    }

    public static int maxConsecutiveOnes(int N) {
        String num = Integer.toBinaryString(N);
        System.out.println(num);
        int max = 0;
        int count = 0;
        for (int i = 0; i < num.length(); i++) {

            if (num.charAt(i) == '1') {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
