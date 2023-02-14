import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        // declarations:

        int guess = 0;  // stores input
        String trash = ""; // bad input

        Scanner in = new Scanner(System.in); // scanner

        // number generator
        Random generator = new Random();
        int rand = generator.nextInt(10) + 1; // stores random number 0-9,then adds 1
        boolean correct = false; // guessing loop ends when true



        // greeting
        System.out.println("Hello!\n" +
                "I'm thinking of a number 1-10. Guess!");


        // loop:

        do {
            // input:
            if (in.hasNextInt()) { // if input is integer, store it
                guess = in.nextInt();

                if (guess == rand) { // if correct, change "correct" to true to end the loop
                    System.out.println("You got it! The number I was thinking of was " + rand + ".");
                    correct = true;

                } else if (guess < rand) { // if not, check if smaller
                    System.out.println("Too low! Guess again."); // then loop repeats

                } else { // if not, it's bigger. loop repeats
                    System.out.println("Too high! Guess again.");
                }

                // if input is not an int:
            } else {
                trash = in.nextLine(); // throw out bad input
                System.out.println("ERROR: \"" + trash + "\" could not be interpreted as a number. " +
                        "Please exit and try again.");
                System.exit(0); // terminate
            }

        } while (!correct); // loop runs while "correct" is set to false


        // end

    }
}