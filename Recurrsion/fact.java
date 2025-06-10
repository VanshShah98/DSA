package Recurrsion;

class fact{
    public static void main(String[] args) {
        facto(1, 6, 1);
    }
    public static void facto(int i , int n , int fac){
        if(i==n){
            fac= fac*i;
            System.out.println(fac);
            return;
        }
        fac = fac*i;
        System.out.println(i);
        facto(i+1, n, fac);
    }
}