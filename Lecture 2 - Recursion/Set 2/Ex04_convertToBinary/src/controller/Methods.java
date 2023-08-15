package controller;


public class Methods {
    public Methods() {
        super();
    }
    
    // Convert a base-10 number to base-2 (binary).
    public String convertToBinary(int n) {
        // If division n / 2 = 0, return the remainder as string. 
        if(n / 2 == 0) {
            return String.valueOf(n % 2);
        } else {
            // Compute the remainder of n/2 and stores as a string.
            String digit = String.valueOf(n % 2);
            // Concatenate the recursion return with the current digit.
            return convertToBinary(n/2).concat(digit);
        }
    } 
}
