package NeetCode.TwoPointer;

public class TrapingWater {
    public static void main(String[] args) {
        int [] height ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int left =0;
        int right =height.length-1;
        int left_max =0;
        int right_max=0;
        int water=0;
        while (left<right) {
            left_max=Math.max(left_max, height[left]);
            right_max=Math.max(right_max, height[right]);
            if(left_max<right_max){
                water+=left_max-height[left];
                left++;
            }
            else{
                water+=right_max-height[right];
                right--;
            }

        }
        return water;
    }
}
