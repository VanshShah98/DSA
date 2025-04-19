package Assignment;

import java.util.ArrayList;
import java.util.List;

public class skippedidex {
    public static void main(String[] args) {

        List<Integer> sequence = generateSequence(100);
        

        for (int i = 0; i < sequence.size(); i++) {
            System.out.print(sequence.get(i));
            if (i < sequence.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        

        List<Integer> skippedIndices = getSkippedIndices(100);
        List<Integer> remainingSequence = new ArrayList<>();
        for (int i = 0; i < sequence.size(); i++) {
            if (!skippedIndices.contains(i + 1)) { 
                remainingSequence.add(sequence.get(i));
            }
        }
        


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
    

    public static List<Integer> getSkippedIndices(int n) {
        List<Integer> skippedIndices = new ArrayList<>();

        int[] knownSkipped = {4, 9, 14, 21, 29, 38, 49, 62, 79};
        for (int index : knownSkipped) {
            if (index <= n) {
                skippedIndices.add(index);
            }
        }
        

        int lastIndex = 79;
        int lastDiff = 17; 
        int step = 2; 
        while (lastIndex <= n) {
            lastDiff += step;
            lastIndex += lastDiff;
            if (lastIndex <= n) {
                skippedIndices.add(lastIndex);
            }
            step++; 
        }
        
        return skippedIndices;
    }
}