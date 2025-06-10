package Recurrsion;

public class firstandLast {
    public static int first = -1;
    public static int last = -1;
    public static void find(String str,char ele ,int idx){
        if(idx==str.length()-1){
            System.out.println("First:"+first+" "+"Last :"+ last);
            return;
        }
        char curr = str.charAt(idx);
        if(curr == ele){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        find(str, ele, idx+1);
    }
    public static void main(String[] args) {
        String a = "vansh shah";
        find(a,'a', 0);
    }
}
