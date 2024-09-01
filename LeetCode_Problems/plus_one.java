import java.util.ArrayList;

public class plus_one {
    public static void main(String[] args) {
        int num[] = { 8, 7, 1, 9 };
        num = plusOne2(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        int count = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 9) {
                count++;
            }
        }
        if (count == digits.length) {
            newArray.add(1);
            for (int j = digits.length - 1; j >= 0; j--) {
                if (digits[j] == 9) {
                    digits[j] = 0;
                }

            }
            for (int j = 0; j < digits.length; j++) {
                newArray.add(digits[j]);
            }

            int[] ret = new int[newArray.size()];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = newArray.get(i).intValue();
            }
            return ret;

        } else {
            int ptr = digits.length - 1;

            for (int i = digits.length - 1; i >= 0; --i) {
                if (digits[ptr] == 9) {
                    digits[ptr] = 0;
                    ptr--;
                } else {
                    digits[ptr] += 1;
                    return digits;
                }
            }
            for (int i = digits.length - 1; i >= 0;) {
                if (digits[ptr] == 9) {
                    digits[i] = 0;
                    digits[digits.length - 1] = 0;
                    digits[digits.length - 2] = digits[digits.length - 2] + 1;
                    return digits;
                } else {
                    digits[digits.length - 1] = digits[digits.length - 1] + 1;
                    return digits;
                }
            }
        }
        return digits;

    }

    public static int[] plusOne2(int[] digits) {
        int n = digits.length;
        int carry = 1; // Start with 1 to add one

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] + carry <= 9) { // If the current digit + carry is less than or equal to 9
                digits[i] += carry; // Add carry to the current digit
                carry = 0; // Reset carry
                break; // No need to continue further
            } else { // If the sum exceeds 9
                digits[i] = 0; // Set the current digit to 0
                carry = 1; // Update carry to 1
            }
        }

        // If there's still a carry after traversing the array, it means the number had
        // all 9's
        if (carry == 1) {
            int[] newArray = new int[n + 1]; // Create a new array with one extra digit
            newArray[0] = 1; // Set the first digit to 1
            System.arraycopy(digits, 0, newArray, 1, n); // Copy the original digits to the new array
            return newArray; // Return the new array
        } else {
            return digits; // Return the original array with modifications
        }
    }

}
