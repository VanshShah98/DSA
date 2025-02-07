package NeetCode.Array_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreq {
    public static void main(String[] args) {
        int[] nums={4,5,4,6,6,6,6,4,25,16};
        int[] ans = topKFrequent(nums,2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }   
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
            new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();  
            }
        }
        List<Integer> topK = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            topK.add(minHeap.poll().getKey());
        }
        
       
        Collections.reverse(topK);
        for(int i=0;i<k;i++){
            ans[i]=topK.get(i);
        }

        return ans;
    }
    
}