package NeetCode.TwoPointer;

public class TwoSumII {
    public static void main(String[] args) {
        int [] num = {2,7,11,15};
        int [] ans = twoSum(num, 9);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + "  ");
        }
 
    }
    public  static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r=numbers.length-1;
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if (sum == target) {
                return new int[] { l + 1, r + 1 };
            }
            else if(sum<target){
                l++;
            }
            else if(sum>target){
                r--;
            }
        } 
        return new int[0]; 
    }
}
