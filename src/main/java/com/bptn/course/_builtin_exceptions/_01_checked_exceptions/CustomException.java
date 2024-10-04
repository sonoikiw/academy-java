package com.bptn.course._builtin_exceptions._01_checked_exceptions;
import java.util.Scanner;
public class CustomException {
    public static void main(String[] args) {
        // Define a Scanner instance
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a file name with the correct extension
        System.out.println("Enter the file name with correct extension i.e. .txt: ");
        // Read the file name from the user's input
        String fileName = scanner.nextLine();
        try {
            // Validate the file extension
            validateFileExtension(fileName);
            // If the file extension is valid, print success message
            System.out.println("Correct file name with extension .txt");
        } catch (FileExtensionException e) {
            // If an exception is caught, print an error message
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner instance in the finally block
            scanner.close();
        }
    }
    // Private static method to validate the file extension
    private static void validateFileExtension(String fileName) throws FileExtensionException {
        // If the file name doesn't end with ".txt", throw FileExtensionException
        if (!fileName.endsWith(".txt")) {
            throw new FileExtensionException("File doesn't have .txt extension");
        }
    }
}