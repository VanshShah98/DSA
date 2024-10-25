public class reversethestring {
    public static void main(String[] args) {
        System.out.println(reverseWords("i am     placed"));
    }

    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i > 0; i--) {

            if (arr[i] != " ") {
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        sb.append(arr[0]);
        return sb.toString().strip();
    }
}
