import java.util.Scanner;

class OderagnosticBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(OrderBS(arr, target));
        sc.close();
    }

    static int OrderBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[start] > arr[mid]) {// descending
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {// ascending
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}