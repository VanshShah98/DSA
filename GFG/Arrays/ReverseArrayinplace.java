package GFG.Arrays;

public class ReverseArrayinplace {
    public static void main(String[] args) {
        
    }
    public void reverseArray(int arr[]) {
        // code here
        int i=0;
        int j =arr.length-1;
        while(i<j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
            i++;
            j--;
        }
    }
}
