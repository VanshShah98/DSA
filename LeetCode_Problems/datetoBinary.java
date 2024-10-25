
public class datetoBinary {
    public static void main(String[] args) {
        System.out.println(convertDateToBinary("1920-10-02"));

    }

    public static String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        for (String str : date.split("-")) {
            sb.append(helper(str));
            sb.append("-");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static String helper(String s) {
        return Integer.toBinaryString(Integer.valueOf(s));
    }
}
