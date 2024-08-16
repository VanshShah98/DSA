class swap2 {
    public static void main(String[] args) {
        int a = 20, b = 30;
        a = a + b;
        b = a - b;
        a = b - a;
        System.out.println(-a);
        System.out.println(b);
    }
}