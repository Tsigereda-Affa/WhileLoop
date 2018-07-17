import java.util.Scanner;

public class Main {
    // explantion of while loop
    //
    //while (expression) {
    //      (expression/stoping condition)  the condtion you put means stop when it is false and intializ the false condtion,
    // if you put a a namber that makes it true put the condtion not equal as a stoping condtion
    // // do you thing as long as the expression is true
    //}
    //The while loop will continue until the test condition is true. You can also break out of a while loop by using the keyword ```break```.
    // Modify the above program to also exit the while loop if the person guesses "5".
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int secretNumber, guess = 0;//guess is initialized to 0
            int secondSecretNumber = 5;
            secretNumber = 123;

            System.out.println("I'm thinking of a number between 1 and 1000");
            System.out.print("Enter the number:");
            guess = keyboard.nextInt();

            while ( guess != secretNumber && guess != secondSecretNumber  )
            {
                System.out.println("\nYou are wrong. Try again.");
                System.out.println("Enter the number: ");
                guess = keyboard.nextInt();

            }
            System.out.println("You are correct. You win a prize!");
            keyboard.close();
    }


}
