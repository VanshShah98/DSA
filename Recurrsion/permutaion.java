package Recurrsion;

public class permutaion {
    public static void permu(String input,String permutation){
        if(input.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<input.length();i++){
            char currChar = input.charAt(i);
            String newString = input.substring(0, i)+input.substring(i+1);
            permu(newString, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String input="abc";
        permu(input,"");
    }
}
