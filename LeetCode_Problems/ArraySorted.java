public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5, 6, 7, 8, 9, 10 };
        check(arr, 0);
    }

    // Method to check if an array is sorted or not.
    public static void check(int[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println("The array is sorted");
            return;
        }
        if (arr[index] > arr[index + 1]) {
            System.out.println("The array is not sorted.");
            return;
        } else {
            check(arr, index + 1);
        }

    }
}
