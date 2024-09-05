// https://leetcode.com/problems/richest-customer-wealth/
class WealthOfPerson {

    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int per = 0; per < accounts.length; per++) {
            int sum = 0;
            for (int acc = 0; acc < accounts[per].length; acc++) {
                sum += accounts[per][acc];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}