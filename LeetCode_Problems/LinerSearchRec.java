public class LinerSearchRec {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 9, 8, 4, 2, 3, 5, 7, 32, 5, 1, 0, 1, 2, 5, 10, 12, 1, 5, 3 };
        Search(arr, 3, 0);
    }

    public static void Search(int arr[], int target, int index) {
        if (index == arr.length - 1) {
            System.out.println("Element not present on the array");
            return;
        }
        if (arr[index] == target) {
            System.out.println("Element is found at index " + index);
        }
        Search(arr, target, index + 1);

    }
}
