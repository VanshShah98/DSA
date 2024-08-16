import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 50, 25, 26, 81, 42, 26, 25, 29, 21, 32, 1, 10, 6, 12, 13, 25, 32, 25, 24, 21, 23, 21, 20, 24, 29,
                35, 25, 25, 26, 24, 21, 20, 23, 20, 217, 25, 25, 25, 25, 25, 25, 26, 24, 21, 31, 11, 10 };
        System.out.println(Linear(arr, 10));
    }

    public static ArrayList<Integer> Linear(int arr[], int target) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                answer.add(i);
            }
        }
        return answer;
    }
}
