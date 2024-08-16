public class UniqueItem {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5 };
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a ^= arr[i];
        }
        System.out.println(a);
    }
}
