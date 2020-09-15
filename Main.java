import java.util.Scanner;
/**
 * This program will be able to play fizzbuzz
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    //prompt the user to enter integer
    System.out.println("Please enter a number to play FizzBuzz");
    //get the iteger from the user
    int num1 = input.nextInt();

    if ((num1 % 5 == 0) && (num1 % 3 == 0)){
      System.out.println("You should say FizzBuzz");
    } else if ((num1 % 3 == 0)){
      System.out.println("You should say Fizz");
    } else if ((num1 % 5 == 0)){
      System.out.println("You should say Buzz");
    } else if ((num1 % 3 != 0) && (num1 % 5 != 0)){
      System.out.println("You should say " + num1);
    }

  }
}
