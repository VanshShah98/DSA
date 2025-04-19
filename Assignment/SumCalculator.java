package Assignment;

import java.util.ArrayList;
import java.util.List;

public class SumCalculator {
    public static void main(String[] args) {

        List<Integer> sequence = generateSequence(100);
        

        long S1 = 0;
        for (int num : sequence) {
            S1 += num;
        }
        

        long S2 = 0;
        for (int i = 0; i < 82; i++) {
            S2 += sequence.get(i);
        }

        long S3 = S1 - S2;
        

        

        System.out.println("S3 = " + S3);
        

    }
    

    public static List<Integer> generateSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        

        int[] knownDifferences = {
            7, 14, 21, 35, 42, 49, 56, 70, 77, 84, 91, 98, 112, 119, 
            126, 133, 140, 147, 161, 168, 175, 182, 189, 196, 203, 217, 
            224, 231, 238, 245, 252, 259, 266, 280
        };
        

        int current = 12;
        sequence.add(current);

        int diffIndex = 0;
        while (sequence.size() < n && diffIndex < knownDifferences.length) {
            current += knownDifferences[diffIndex];
            sequence.add(current);
            diffIndex++;
        }
        

        int lastDiff = knownDifferences[knownDifferences.length - 1]; 
        while (sequence.size() < n) {
            lastDiff += 7; 
            current += lastDiff;
            sequence.add(current);
        }
        
        return sequence;
    }
}