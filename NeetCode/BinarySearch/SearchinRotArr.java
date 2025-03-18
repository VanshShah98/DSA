public class SearchinRotArr {
    public static void main(String[] args) {
        int[] nums = { 1, 3 };
        int target = 3;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (target > nums[mid] || nums[l] > target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            else{
                if(target < nums[mid] || target > nums[r] ){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }

        }
        return -1;
    }
}
