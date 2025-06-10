package Recurrsion;

public class stringrev {
    public static void rev(String str,int ptr){
        if(ptr==0){
            System.out.println(str.charAt(ptr));
            return;
        }
        System.out.println(str.charAt(ptr));
        rev(str, ptr-1);
    }
    public static void main(String[] args) {
        String a = "aabcd";
        rev(a,a.length()-1);
    }
}
