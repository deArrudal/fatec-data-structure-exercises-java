package controller;

public class Methods {
    public Methods() {
        super();
    }
    
    // Invert a string.
    public String invertString(String sample) {
        // Return the array when empty.
        if(sample.isEmpty()) {
            return sample;
        } else {
            // Call recursion removing the first letter.
            // Concatenate the returned string with the original first letter, reversing the original order. 
            return invertString(sample.substring(1)).concat(sample.substring(0,1));
        }
    }
}
