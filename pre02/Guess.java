//The goal of this exercise is to program a “Guess My Number” game. 

import java.util.Random;

class Guess{

public static void main(String[] args) {

// The definition of GuessStarter is in a file called GuessStarter.java, in the directory called ch03, in the repository for this book. 1) Compile and run this program. 2) Modify the program to prompt the user, then use a Scanner to read a line of user input. Compile and test the program. 3) Read the user input as an integer and display the result. Again, compile and test. 5) Compute and display the difference between the user’s guess and the number that was generated.

int guess;
Scanner in = new Scanner(System.in);
     
System.out.println("I am thinking of a number between 1 and 100 (including both).  Can you guess the number? ");

// Take input for guessing
guess = in.nextInt();

System.out.println("You Guessed: " + guess);

// pick a random number
Random random = new Random();
int number = random.nextInt(100) + 1;

System.out.println("The number I was thinking of is: " + number);

//System.out.println("You were off by: " );
//System.out.println(number - guess);
  

}
}