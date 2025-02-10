package NeetCode.Sliding_Window;

public class BestTimetoBuyandsell {
    public static void main(String[] args) {
        int [] nums ={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        int min_val=Integer.MAX_VALUE;
        int max_val=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min_val){
                min_val=prices[i];
            }
            else if(prices[i]-min_val>max_val){
                max_val=prices[i]-min_val;
            }
        }

        return max_val;
    }
}
