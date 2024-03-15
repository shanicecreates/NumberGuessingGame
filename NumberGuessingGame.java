import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
        playNumberGuessingGame();
    }
    
    // Function to play the number guessing game
    public static void playNumberGuessingGame() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = generateRandomNumber(1, 100); // Generate a random number between 1 and 100
        int maxAttempts = 5; // Maximum number of attempts allowed
        
        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");
        
        try {
            for (int attempt = 0; attempt < maxAttempts; attempt++) {
                System.out.println("Guess the number:");
                int guess = scanner.nextInt(); // Take input for guessing
                
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number.");
                    return; // Exit the function if the number is guessed correctly
                } else if (guess < randomNumber) {
                    System.out.println("The number is greater than " + guess);
                } else {
                    System.out.println("The number is less than " + guess);
                }
            }
            
            // If all attempts are used and the number is not guessed
            System.out.println("You have exhausted all trials.");
            System.out.println("The number was " + randomNumber);
        } finally {
            scanner.close(); // Close the Scanner object in a finally block
        }
    }
    
    // Function to generate a random number within a given range
    public static int generateRandomNumber(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
