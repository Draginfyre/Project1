import java.util.Scanner;

public class Project1_DragonCave {

    private static Scanner scanning = new Scanner(System.in);

    public static void runProject1()
    {
        System.out.println(
            "You are in a land full of dragons. In front of you, you see two caves."+ "\n" +
            "In one cave, the dragon is friendly and will share his treasure with you."+ "\n" +
            "The other dragon is greedy and hungry and will eat you on sight."+ "\n" +
            "Which cave will you go into? (1 or 2)"
        );


        System.out.println("Enter number 1 or 2. Enter 'Q' to quit game.");
        String input = getInput();
        if (input.equals("1") || input.equals("2"))
        {
            if (input.equals("1"))
            {
                System.out.println(
                    "You approach the cave... "+"\n" +
                    "It is dark and spooky... "+"\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and..."+"\n" +
                    "Gobbles you down in one bite! "
                );

            }else if (input.equals("2"))
            {
                System.out.println(
                    "You enter the cave, and the dragon residing within will give you a gift! The gift of knowledge!"+"\n" +
                    "He tells you to ask him a question. After a moment you come up with question..."+"\n" +
                    "What is the answer to life, the universe and everything?"+"\n" +
                    "42,says the dragon. "
                );
            }
        }else if(input.equals("Q") || input.equals("q"))
            System.out.println("The game is now over. No dragons, caves, or treasure for you.");
       /*
        else
        {
            System.out.println("That is not a valid output. If you want to quit, type Q, otherwise give either 1 or 2.");
            getInput();
        }
        */

        scanning.close();
    }

    public static String getInput()
    {
        String input = scanning.nextLine();

        if (input.equals("1") || input.equals("2")||input.equals("Q") || input.equals("q"))
        {
            return input;
        }else {
            System.out.println("That is not a valid input. If you want to quit, type Q, otherwise give either 1 or 2.");
            input= getInput();
        }
        return input;
    }

}





