package Assignment_2;

import java.util.ArrayList;
import java.util.List;

public class skippedindex {
    public static void main(String[] args) {

        List<Integer> sequence = generateSequence(100);
        Even();
        System.out.println("Prime Count");
        System.out.println(PrimeCount(sequence));
        System.out.println("SUM");
        System.out.println(SUM(sequence));

        for (int i = 0; i < sequence.size(); i++) {
            System.out.print(sequence.get(i));
            if (i < sequence.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        

        List<Integer> remainingSequence = new ArrayList<>();
        for (int i = 0; i < sequence.size(); i++) { 
                remainingSequence.add(sequence.get(i));
        }
        


    }
    
 
    public static List<Integer> generateSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        

        int[] knownDifferences = {
            3, 8, 13, 18, 23, 28, 33, 38, 43, 48, 53, 58, 63, 68, 
            73, 78, 83, 88, 93, 98, 103, 108, 113, 118, 123, 128, 
            133, 138, 143, 148, 153, 158, 163,168
        };
        

        int current = 1;
        sequence.add(current);
        

        int diffIndex = 0;
        while (sequence.size() < n && diffIndex < knownDifferences.length) {
            current += knownDifferences[diffIndex];
            sequence.add(current);
            diffIndex++;
        }
        

        int lastDiff = knownDifferences[knownDifferences.length - 1]; 
        while (sequence.size() < n) {
            lastDiff += 5; 
            current += lastDiff;
            sequence.add(current);
        }
        
        return sequence;
    }
    

    public static void Even(){
        int [] arr_100 = {1, 4, 12, 25, 43, 66, 94, 127, 165, 208, 256, 309, 367, 430, 498, 571, 649, 732, 820, 913, 1011, 1114, 1222, 1335, 1453, 1576, 1704, 1837, 1975, 2118, 2266, 2419, 2577, 2740, 2908, 3081, 3259, 3442, 3630, 3823, 4021, 4224, 4432, 4645, 4863, 5086, 5314, 5547, 5785, 6028, 6276, 6529, 6787, 7050, 7318, 7591, 7869, 8152, 8440, 8733, 9031, 9334, 9642, 9955, 10273, 10596, 10924, 11257, 11595, 11938, 12286, 12639, 12997, 13360, 13728, 14101, 14479, 14862, 15250, 15643, 16041, 16444, 16852, 17265, 17683, 18106, 18534, 18967, 19405, 19848, 20296, 20749, 21207, 21670, 22138, 22611, 23089, 23572, 24060, 24553};
        System.out.print("Even : ");
        ArrayList<Integer> Even = new ArrayList<>();
        for(int i=0;i<arr_100.length;i++){
            if(arr_100[i]%2==0){
                System.out.print(arr_100[i] + " ,");
                Even.add(arr_100[i]);
            }
        }
        System.out.println("Even SUM :" + SUM(Even));
        System.out.println();
        System.out.println();
    }
    public static boolean Prime(int number) {
        int flag = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = 1;
            } else {
                flag = 0;
            }
        }

        if (flag == 1) {
            return false;
        } else {
            return true;
        }
    }
    public static int PrimeCount(List<Integer> seq){
        int count=0;
        for(int i =1 ;i< seq.size();i++){
            if(Prime(seq.get(i)-seq.get(i-1))){
                count++;
            }
        }

        return count;
    }
    public static int SUM(List<Integer> seq){
        int sum=0;
        for(int i =0 ;i< seq.size();i++){
            sum+=seq.get(i);
        }
        return sum;
    }
}