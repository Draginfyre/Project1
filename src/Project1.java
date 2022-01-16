



import java.util.Scanner;

public class Project1 {

    public static void main(String[] args)
    {
        System.out.println(
                "You are in a land full of dragons. In front of you, you see two caves./n" +
                        "In one cave, the dragon is friendly and will share his treasure with you./n" +
                        "The other dragon is greedy and hungry and will eat you on sight./n" +
                        "Which cave will you go into? (1 or 2)"
        );


        System.out.println("Enter number 1 or 2. Enter 'Q' to quit game.");
        String input = getInput();
        if (input.equals("1") || input.equals("2"))
        {
            if (input.equals("1"))
            {
                System.out.println("You approach the cave.../n"+
                        "It is dark and spooky.../n"+
                        "A large dragon jumps out in front of you! He opens his jaws and.../n"+
                        "Gobbles you down in one bite!");
            }else if (input.equals("2"))
            {
                System.out.println("You enter the cave, and the dragon residing within will give you a gift! The gift of knowledge! \nHe tells you to ask him a question. After a moment you come up with quesiton: ");
                System.out.println("\"What is the answer to life, the universe and everything?\"");
                System.out.println("\"42\" says the dragon.");
            }
        }else if(input.equals("Q") || input.equals("q"))
            System.out.println("The game is now over. No dragons, caves, or treasure for you.");
        else
            System.out.println("That is not a valid output. Try again, or enter 'Q' to quit the game.");
    }

    public static String getInput()
    {
        Scanner scanning = new Scanner(System.in);
        String input = scanning.nextLine();
        scanning.close();
        return input;
    }
}





