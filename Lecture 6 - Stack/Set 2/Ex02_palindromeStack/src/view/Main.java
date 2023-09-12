package view;

import java.util.Scanner;
import controller.Palindrome;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Palindrome method = new Palindrome();
        String word;

        System.out.print("Enter the word: ");
        word = scan.nextLine();

        if (method.isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " isn't a palindrome");
        }

        scan.close();
    }
}