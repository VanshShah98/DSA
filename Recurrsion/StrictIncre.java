package Recurrsion;

public class StrictIncre {
    static boolean flag = true;
    static int prev = -1;
    public static void check(int idx , int [] arr ){
        if(idx==arr.length){
            System.out.println("incresing");
            return;
        }
        if(flag==true){
            if(prev<arr[idx]){
                prev=arr[idx];
            }
            else{
                flag=false;
            }
            check(idx+1, arr);
        }
        else{
            System.out.println("Not incresing");
            return;
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,1,3,4,5,6};
        check(0, arr);
    }
}
