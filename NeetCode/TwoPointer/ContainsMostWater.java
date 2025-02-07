package NeetCode.TwoPointer;

public class ContainsMostWater {
    public static void main(String[] args) {
        int [] height = {2,1,1};
        System.out.println(maxArea2(height));
    }
    //Brute Force
    public static int maxArea(int[] height) {
        int MaxWater = 0;
        int left =0;
        int right = height.length-1;
        while (left<right) {
            MaxWater = Math.max(MaxWater, Math.min(height[right], height[left]) * (right - left));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return MaxWater;

    }
    //Optimized
    public static int maxArea2(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int h = Math.min(height[left],height[right]);
            maxWater = Math.max(maxWater, h*(right - left));
            
            while(left < right && height[left] <= h) {
                left++;
            }
            while(left < right && height[right] <= h) {
                right--;
            }
        }
        return maxWater;
    }
}
