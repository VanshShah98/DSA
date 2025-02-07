package NeetCode.TwoPointer;

public class ValidPalindrom {
    public static void main(String[] args) {
        String s ="race a car";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = result.length()-1;
        for(int i=0 ; i<result.length()/2;i++){
            if(result.charAt(i) != result.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
