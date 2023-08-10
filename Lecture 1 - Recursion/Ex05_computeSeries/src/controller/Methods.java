package controller;

public class Methods {
    public Methods() {
        super();
    }

    // Compute the value of a series.
    public double computeSeries(int n) {
        if (n == 1) {
            // f(1) = 1.
            return 1;
        } else {
            // f(n) = 1/n + f(n - 1).
            return (1 / (double) n) + computeSeries(n - 1);
        }
    }
}
