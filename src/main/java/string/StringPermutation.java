package string;

import java.util.Scanner;

public class StringPermutation {

    // Function to calculate factorial
    static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Function to calculate the number of permutations
    static int numberOfPermutations(String str) {
        int n = str.length();
        int[] freq = new int[256];

        // Count the frequency of each character
        for (int i = 0; i < n; i++) {
            freq[str.charAt(i)]++;
        }

        // Calculate factorial of all characters and divide by
        // factorial of identical characters
        int denominator = 1;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                denominator *= factorial(freq[i]);
            }
        }

        // Calculate number of permutations
        return factorial(n) / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int permutations = numberOfPermutations(str);
        System.out.println("Number of permutations: " + permutations);
        scanner.close();
    }
}
