class order {
    public static void main(String[] args) {
        int[] arr = { 50, 60, 40, 20, 30, 10 };
        int target = 40;
        System.out.println(index(arr, target));
    }

    static int index(int[] arr, int target) {
        // get the mid term
        int start = 0;
        int end = arr.length - 1;
        if (arr[0] < arr[arr.length]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) {
                    start = mid - 1;
                } else if (arr[mid] < target) {
                    end = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;

        }
    }

}
