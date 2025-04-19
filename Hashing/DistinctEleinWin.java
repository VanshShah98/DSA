package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctEleinWin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        List<Integer> res = countDistinct(arr, k);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
    public static List<Integer> countDistinct(int [] arr , int k){
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<k;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i], 0)+1);
        }
        res.add(freqMap.size());
        for(int i=k ;i< arr.length;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
            freqMap.put(arr[i-k],freqMap.getOrDefault(arr[i-k],0)-1);
            if(freqMap.get(arr[i-k])==0){
                freqMap.remove(arr[i-k]);
            }
            res.add(freqMap.size());
        }
        return res;
    }
}
