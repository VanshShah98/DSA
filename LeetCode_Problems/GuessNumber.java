public class GuessNumber {
    /*
     * We are playing the Guess Game. The game is as follows:
     * 
     * I pick a number from 1 to n. You have to guess which number I picked.
     * 
     * Every time you guess wrong, I will tell you whether the number I picked is
     * higher or lower than your guess.
     * 
     * You call a pre-defined API int guess(int num), which returns three possible
     * results:
     * 
     * -1: Your guess is higher than the number I picked (i.e. num > pick).
     * 1: Your guess is lower than the number I picked (i.e. num < pick).
     * 0: your guess is equal to the number I picked (i.e. num == pick).
     * Return the number that I picked.
     * 
     * 
     */
    public static void main(String[] args) {
        System.out.println(guessNumber(50));
    }

    public static int guess(int num) {
        int pick = 10;
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
