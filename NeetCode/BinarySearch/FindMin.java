import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int [] nums = {13,11,14,15};
        System.out.println(findMin2(nums));
    }
    //Most Brute Force Approch
    public int findMin(int[] nums) {

        return Arrays.stream(nums).min().getAsInt();
    }
    public static int findMin2(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int res =  nums[0];
        while (l<=r) {
            if(nums[l]<nums[r]){
                res = Math.min(res,nums[l]);
                break;
            }
            int mid = l +(r-l)/2;
            res=Math.min(res,nums[mid]);
            if(nums[l]<=nums[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        return res;
    }

}
