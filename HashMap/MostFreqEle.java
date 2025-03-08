package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MostFreqEle {
    public static void main(String[] args) {
        int [] arr ={40, 50, 30, 40, 50, 30, 30 };
        MostFreq(arr, arr.length);
    }
    public static int MostFreq(int []  arr , int n){
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i], freqMap.get(arr[i])+1);
            }
            else{
                freqMap.put(arr[i],1);
            }
        }
        int maxCount=0,res = -1;
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(maxCount < entry.getValue()){
                res=entry.getKey();
                maxCount=entry.getValue();
            }
        }
        System.out.println(res + " : " + maxCount);
        return res;
    }
}
