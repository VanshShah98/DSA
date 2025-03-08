package HashMap;

import java.util.HashMap;
import java.util.Map;

public class countingFreq {
    public static void main(String[] args) {
        int [] arr={10, 20, 20, 10, 10, 20, 5, 20};
        Map<Integer,Integer> ans = Freq(arr,arr.length);
        for(Map.Entry<Integer,Integer> entry : ans.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static Map<Integer,Integer> Freq(int [] arr , int  n){
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i],freqMap.get(arr[i])+1);
            }
            else{
                freqMap.put(arr[i], 1);
            }
        }

        return freqMap;
        
    }
}
