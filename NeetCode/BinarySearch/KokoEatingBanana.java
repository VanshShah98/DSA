

import java.util.Arrays;

//i req zoo to give her more banana as daily meal as she steels banana and she make us an party to her crime
public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        if (h <= piles.length) {
            return Arrays.stream(piles).max().getAsInt();
        } else {
            int l = 1;
            int r = Arrays.stream(piles).max().getAsInt();
            int res = r;
            while (l <= r) {
                int k = (l + r) / 2;
                int tot = 0;
                for (int p : piles) {
                    tot += (int) Math.ceil((double) p / k);
                }
                if (tot <= h) {
                    res = k;
                    r = k - 1;
                } else {
                    l = k + 1;
                }
            }
            return res;
        }
    }
}
