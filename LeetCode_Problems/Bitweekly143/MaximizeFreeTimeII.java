package Bitweekly143;

import java.util.Arrays;

public class MaximizeFreeTimeII {
    public static void main(String[] args) {
        int eventTime = 5;
        int k = 1;
        int[] startTime = {1, 3};
        int[] endTime = {2, 5};
        
        int maxFreeTime = getMaxFreeTime(eventTime, k, startTime, endTime);
        System.out.println("Maximum free time: " + maxFreeTime);
    }
    

    public static int getMaxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[][] meetings = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            meetings[i][0] = startTime[i];
            meetings[i][1] = endTime[i];
        }
        
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        
        int maxFree = 0;
        int prevEnd = 0;
        
        for (int i = 0; i < n; i++) {
            maxFree = Math.max(maxFree, meetings[i][0] - prevEnd);
            prevEnd = meetings[i][1];
        }
        
        maxFree = Math.max(maxFree, eventTime - prevEnd);
        
        if (k > 0 && n > 0) {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    maxFree = Math.max(maxFree, meetings[i][0]);
                } else {
                    maxFree = Math.max(maxFree, meetings[i][0] - meetings[i - 1][1]);
                }
            }
        }
        
        return maxFree;
    }
}

