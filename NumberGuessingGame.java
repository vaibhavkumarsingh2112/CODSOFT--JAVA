import java.util.Scanner;

public class NumberGuessingGame {

  static int randomNumber() {

    return (int) (Math.random() * 100) + 1;
  }

  public static void main(String[] args) {
    int random_number = randomNumber();
    int n;
    int attempts = 5;

    System.out.println("    NUMBER GUESSING GAME");
    System.out.println("\n");
    System.out.println("  You have 5 attempts to guess the number");

    System.out.print("  Enter a Number (1-100) : ");

    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();

    while (n != random_number && attempts > 0) {
      if (n > random_number) {
        System.out.println("  Too High");

      } else if (n < random_number) {
        System.out.println("  Too Low");

      }
      attempts--;
      System.out.print("  Enter a Number (1-100) : ");
      n = scanner.nextInt();

    }
    if (n == random_number) {
      System.out.println("You Won! Dare to play again?");

    } else {
      System.out.println("  Sorry, you've run out of attempts. The correct number was: " + random_number);
    }
    System.out.println();
    System.out.print("  Dare to play again? (y or n) ");
    String playAgain = scanner.next();
    System.out.println();
    if (playAgain.equals("y")) {
      main(args);

    } else {

    }

  }
}
