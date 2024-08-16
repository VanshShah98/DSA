import java.util.Scanner;

class floorofnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("size:");
        int n = in.nextInt();
        System.out.println("Target element:");
        int target = in.nextInt();
        int[] arr = new int[n];
        ArrayMake(arr);
        System.out.println("Array:");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(+arr[i] + "  ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("Sorted array:");
        bubbleSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        if (index(arr, target) != -1) {
            System.out.println("element smaller or equal to the target :" + index(arr, target));
        } else {
            System.out.println("Element was not found");
        }
        in.close();

    }

    static int ArrayMake(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        return 0;
    }

    static int bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;

                }
            }
        }
        return 0;
    }

    static int index(int[] arr, int target) {
        // get the mid term
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];

    }
}