package controller;

public class Methods {
    public Methods(){
        super();
    }
    
    // Compute factorial of a number.
    private long computeFactorial(int n) {
        // fat(1) = 1.
        long fat = 1;
        for(int i = 2; i <= n; i++) {
            // fat(n) = n * fat(n-1).
            fat *= i; 
        }
        return fat;
    }

    // Compute the series S = 1 + (1/2!) + (1/3!) + ... + (1/N!).
    public float computeSeries(int n) {
        // S(1) = 1/1! = 1.
        if(n == 1) {
            return 1;
        } else {
            // Compute fat(n).
            long fat = computeFactorial(n);
            // f(n) = (1/n!) + f(n-1).
            return (1 / (float) fat) + computeSeries(n - 1);
        }
    }
}
