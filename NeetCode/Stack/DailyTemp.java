package NeetCode.Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {
    public static void main(String[] args) {
        int [] arr = {73,74,75,71,69,72,76,73};
        arr = dailyTemperatures2(arr);
        System.out.println(Arrays.toString(arr));

    }
   // Brute Force using Array;O(n^2)
    public static int[] dailyTemperatures(int[] temperatures) {
        int [] ans =  new int[temperatures.length];
        for(int i=0;i<temperatures.length-1;i++){
           for(int j=i+1;j<temperatures.length;j++){
            if(temperatures[i]<temperatures[j]){
                ans[i]=j-i;
                break;
            }

           } 
        }
        return ans;
    }
    //Optimized approch using Stack O(n)
    public static int[] dailyTemperatures2(int[] temperatures) {
        int [] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return res;
    }
}

