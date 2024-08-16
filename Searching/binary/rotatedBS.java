class rotatedBS {
    public static void main(String[] args) {

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start - (end - start) / 2;
            // 4cases.
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] > arr[mid + 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid = 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int BS(int[] arr, int target) {
        int p = findPivot(arr);
        if (p == -1) {
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
                    return mid;
                }
            }
            return -1;

        }
        if (p == target) {
            return p;
        } else {
            if (p > target) {
                int start = 0;
                int end = p - 1;
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
                int start = p + 1;
                int end = arr.length - 1;
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
            }
        }

    }
}