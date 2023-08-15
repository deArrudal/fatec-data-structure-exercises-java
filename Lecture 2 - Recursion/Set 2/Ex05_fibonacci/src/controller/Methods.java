package controller;

public class Methods {

	public Methods() {
		super();
	}

	// Compute the n-term of the Fibonacci series.
	public int fibonacci(int n) {
        // Fib(n) = 1, if n = 1 or n = 2.
        if((n == 1) || (n == 2)) {
            return 1;
        } else {
            // Fib(n) = Fib(n - 1) + Fib(n - 2).
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
	}
}
