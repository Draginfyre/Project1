import java.util.Scanner;




public class Project5_Hangman
{
    private static Scanner scan = new Scanner(System.in);


    public static void runProject5()
    {
        //Variables{
        int guess=1;
        String word[] = new String[]{"C","a","t"};
        String input="";
        String hiddenWord[] = new String[]{"_","_","_"};
        boolean guessed=false;
        //}

        while(guess!=7 && guessed==false)
        {
            //Print the prompt, Get input
            printHangman(guess);
            System.out.println(hiddenWord[0]+hiddenWord[1]+hiddenWord[2]);
            input =getInput();
            guessed=true;

            for(int i=0; i<3; i++)
            {
                if(input.equalsIgnoreCase(word[i]))
                    hiddenWord[i]=word[i];

                if (hiddenWord[i] != word[i])
                    guessed = false;
            }

            if(guessed == true)
            {
                System.out.println("You guessed the word \"Cat\" and saved the man!");
            }

            guess++;
        }

        scan.close();

    }

    public static String getInput()
    {
        String input = scan.nextLine();

        if (input.length()==1)
        {
            return input;
        } else {
            System.out.println(input + " is not valid input. Enter a letter.");
            input = getInput();
        }

        return input;
    }

    /**@Method printHangman prints a hangman step for every attempt from 1-6.
     * @param /int guess is the number of guesses the player has attempted
     * @return void, only prints out things
     */
    public static void printHangman(int guess) {
        switch (guess) {
            case 1:
                System.out.println(
                        "=============\n"+
                        "            |\n"+
                        "            |\n"+
                        "            |\n"+
                        "            |\n"+
                        "            |\n"+
                        "    ========|"
                );
                System.out.println("Guess a letter to fill out the three letter word!");
                System.out.println("Enter your first guess...");
                break;
            case 2:
                System.out.println(
                        "=============\n"+
                        "      O     |\n"+
                        "            |\n"+
                        "            |\n"+
                        "            |\n"+
                        "            |\n"+
                        "    ========|"
                );
                System.out.println("Enter your second guess...");
                break;
            case 3:
                System.out.println(
                        "=============\n"+
                        "      O     |\n"+
                        "      |     |\n"+
                        "      |     |\n"+
                        "            |\n"+
                        "            |\n"+
                        "    ========|"
                );
                System.out.println("Enter your third guess...");
                break;
            case 4:
                System.out.println(
                        "=============\n"+
                        "      O     |\n"+
                        "     /|     |\n"+
                        "    / |     |\n"+
                        "            |\n"+
                        "            |\n"+
                        "    ========|"
                );
                System.out.println("Enter your fourth guess...");
                break;
            case 5:
                System.out.println(
                        "=============\n"+
                        "      O     |\n"+
                        "     /|\\    |\n"+
                        "    / | \\   |\n"+
                        "     /      |\n"+
                        "    /       |\n"+
                        "    ========|"
                );
                System.out.println("Enter your fifth (and final!) guess...");
                break;
            case 6:
                System.out.println(
                        "=============\n"+
                        "      O     |\n"+
                        "     /|\\    |\n"+
                        "    / | \\   |\n"+
                        "     / \\    |\n"+
                        "    /   \\   |\n"+
                        "    ========|"
                );
                System.out.println("You ran out of guesses! You lose!");
                break;
            default:
                System.out.println("There was an error, the amount of guesses doesn't add up. Only 1-5 guesses, with the 6th being the game over.");
        }
    }
}


