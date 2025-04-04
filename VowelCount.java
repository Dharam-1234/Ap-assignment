import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize a variable to store the count of vowels
        int vowelCount = 0;

        // Convert the string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            // Get each character
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                // Increment the vowel count if it's a vowel
                vowelCount++;
            }
        }

        // Print the number of vowels found in the string
        System.out.println("Number of vowels in the string: " + vowelCount);
        
        // Close the scanner object
        scanner.close();
    }
}
