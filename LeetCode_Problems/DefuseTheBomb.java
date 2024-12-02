public class DefuseTheBomb {
    public static void main(String[] args) {
        int[] code = { 5, 7, 1, 4 };
        int k = 3;
        code = decrypt(code, k);
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i] + " ");
        }
    }

    public static int[] decrypt(int[] code, int k) {
        int[] n = code;
        for (int i = 0; i < code.length; i++) {
            code[i] = sumNext(n, k, i);
        }
        return code;
    }

    public static int sumNext(int[] code, int k, int i) {

        int sum = 0;
        int count = k;
        int a = i;
        if (count == 0) {
            return 0;
        }
        if (k > 0) {
            while (k > 0) {
                if (a == code.length - 1) {
                    a = 0;
                }
                sum += code[a++];
                k--;

            }
        }
        if (k < 0) {
            for (int j = i; j <= k; j--) {
                a = j;
                if (count >= 0) {
                    if (a == code.length) {
                        a = 0;
                    }
                    sum += code[++a];
                    count--;
                }

            }
        }

        return sum;
    }
}
