class Fibonacci {
    static int Fib(int n)
    {
        if (n == 0 || n == 1)
            return n;

        return Fib(n - 1) + Fib(n - 2);
    }

    public static void main(String[] args)
    {
        // Fibonacci of 3
        System.out.println("Fibonacci of " + 3 + " "
                + Fib(3));

        // Fibonacci of 4
        System.out.println("Fibonacci of " + 4 + " "
                + Fib(4));

        // Fibonacci of 3
        System.out.println("Fibonacci of " + 5 + " "
                + Fib(5));
    }
}