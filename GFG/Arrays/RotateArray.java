package GFG.Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        rotateArr(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateArr(int arr[], int d) {
        // add your code here
        d =d%arr.length;
        if(d==0){
            return;
        }
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);

    }
    public static void reverse(int[] arr , int start , int end){
        while (start<end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
