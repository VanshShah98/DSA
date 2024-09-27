public class DeffangIp {
    public static void main(String[] args) {
        String IP = "192.159.162.50";
        System.out.println(defangIPaddr(IP));
    }

    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                ans.append(address.charAt(i));
            } else {
                ans.append("[.]");
            }
        }
        return ans.toString();
    }
}
