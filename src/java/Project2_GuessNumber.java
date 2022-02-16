import java.util.Scanner;

public class Project2_GuessNumber
{
    static Scanner scan = new Scanner(System.in);
    public static void runProject2()
    {



        int random = (int) (Math.random() * (20)) + 1;//Picks the random number

        String input;
        int guess; //The parsed(int) guess

        System.out.println("The secret number...is... " + random);
        System.out.println("Guess a number between 1 and 20 and win the game! You have six attempts!");

        //This will run until either the number is guessed or the number of attempts is not over 6.
        for (int attempt = 1; attempt<=7; attempt++)
        {
            input = getInput("Guess a number!");



            if (input.equals(random + ""))
            {
                System.out.println("You guessed the number! You win!");
                attempt=10;
                scan.close();
            }
            else
            {
                try
                {
                    guess = Integer.parseInt(input);

                    //Helps the player find out what the answer is.

                    if(guess>20)
                        System.out.println("Your guess can't be over 20!"); //Player guesses over 20
                    else if(guess<1)
                        System.out.println("Your guess can't be under 1!"); //Player guesses under 1
                    else if(guess>random)
                        System.out.println("Your guess is too high!");      //Player guesses too high
                    else if(guess<random)
                        System.out.println("Your guess is too low!");       //Player guesses too low

                }
                catch (NumberFormatException exception)
                {
                    System.out.println("That's not a valid guess! Pick a number between 1 and 20!");
                }

                System.out.println("Attempt number: " + attempt);

                switch (attempt) {
                    case 1: System.out.println();
                    case 2:
                        System.out.println("Enter your second attempt...");
                        break;
                    case 3:
                        System.out.println("Enter your third attempt...");
                        break;
                    case 4:
                        System.out.println("Enter your fourth attempt...");
                        break;
                    case 5:
                        System.out.println("Enter your fifth attempt...");
                        break;

                    case 6:
                        System.out.println("Enter your sixth, and final, attempt...");
                        break;
                    default:
                        System.out.println("You ran out of attempts! You lose!");
                        scan.close();
                }
            }
        }
    }



    public static String getInput(String Prompt)
    {
        System.out.println(Prompt);
        String input = scan.next();
        return input;
    }


}

