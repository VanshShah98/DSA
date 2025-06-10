package Recurrsion;

public class fab {
    public static void main(String[] args) {
        System.out.println(fabi(3));
    }
    public static int fabi(int n){
        if(n<2){
            return n;
        }
        return fabi(n-1)+fabi(n-2);
    }
}
