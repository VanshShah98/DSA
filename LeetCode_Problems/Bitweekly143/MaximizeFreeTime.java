package Bitweekly143;

import java.util.*;

class MaximizeFreeTime{
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        // Compute durations and prefix sums.
        // Using long for prefix sums (the sums may be large).
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++) {
            int dur = endTime[i] - startTime[i];
            pre[i + 1] = pre[i] + dur;
        }
        
        // Define:
        // A(j) = startTime[j] - pre[j]
        // X(i) = pre[i+1] - endTime[i]
        long[] A = new long[n];
        long[] X = new long[n];
        for (int i = 0; i < n; i++) {
            A[i] = (long) startTime[i] - pre[i];
            X[i] = pre[i + 1] - endTime[i];
        }
        
        long ans = 0;
        
        // 1. Prefix candidate:
        // For j in [0, n-1] with j <= k, if we reschedule meetings [0, j-1]
        // to time 0, the gap before meeting j is A(j).
        for (int j = 0; j < n && j <= k; j++) {
            ans = Math.max(ans, A[j]);
        }
        
        // 2. Suffix candidate:
        // If we fix meeting i and reschedule meetings i+1..n-1,
        // the gap after meeting i is:
        //   eventTime - [ endTime[i] + (pre[n] - pre[i+1]) ]
        // This is allowed if (n-i-1) <= k.
        for (int i = Math.max(0, n - k - 1); i < n; i++) {
            long candidate = eventTime - pre[n] - (endTime[i] - pre[i + 1]);
            ans = Math.max(ans, candidate);
        }
        
        // 3. Middle candidate:
        // For each meeting j (fixed) with j >= 1, consider an eligible i in
        // [max(0, j-k-1), j-1] (ensuring j-i-1 <= k).
        // The candidate gap is A(j) + X(i).
        // Use a deque to maintain the maximum X(i) in the current window.
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(0); // for j=1, window is [0,0]
        
        for (int j = 1; j < n; j++) {
            int L = Math.max(0, j - k - 1);
            // Remove indices from the front that are no longer in the window.
            while (!dq.isEmpty() && dq.peekFirst() < L) {
                dq.pollFirst();
            }
            // dq.peekFirst() is now the index with maximum X in the window [L, j-1].
            if (!dq.isEmpty()) {
                long candidate = A[j] + X[dq.peekFirst()];
                ans = Math.max(ans, candidate);
            }
            // Insert j into the deque, maintaining decreasing order of X values.
            while (!dq.isEmpty() && X[dq.peekLast()] <= X[j]) {
                dq.pollLast();
            }
            dq.add(j);
        }
        
        // 4. Full compression candidate:
        // If k equals the number of meetings (i.e. we can move them all),
        // we can compress all meetings to time 0 so that the gap is eventTime - pre[n].
        if(k == n) {
            ans = Math.max(ans, eventTime - pre[n]);
        }
        
        return (int) Math.max(ans, 0);
    }
}