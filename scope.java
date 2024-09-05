class scope {

    public static int Funscope1(int a, int b) {
        return a + b;
    }

    public void Funscope2(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        int m = 6, n = 5;

        int c = scope.Funscope1(m, n);
        System.out.println(c);
        scope s = new scope();
        s.Funscope2(m, n);

        {
            int x = 5;
            for (x = 0; x < 5; x++) {
                System.out.println(x);
            }
        }

    }
}
