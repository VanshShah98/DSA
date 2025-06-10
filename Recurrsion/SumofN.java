package Recurrsion;

public class SumofN {
    public static void main(String[] args) {
        System.out.println(sumN(1, 0, 17039));
    }
    public static int sumN(int n,int sum,int target){
        if(n == target+1){
            return sum;
        }
        // System.out.println(sum);
        return sumN(n+1, sum+n, target);
    }
}
