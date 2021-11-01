import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This same is about to start...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");

        System.out.println("Hi there. What's your name? > ");
        String name = input.nextLine();
        System.out.println("Hi, " + name + " --- Welcome to The Mars Adventure Game.");
        System.out.println("Yesterday, you received a call from your good friend at NASA.");
        System.out.println("They need someone to go to Mars this weekend, and you've been chosen.");

        System.out.println("Are you excited? Type Y or N");
        while (true) {
            String excited = input.nextLine();
            String excitedInput = excited.toUpperCase();
            if (excitedInput.equals("Y")) {
                System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
                break;
            } else if (excitedInput.equals("N")) {
                System.out.println("Well... it is what it is. Time to go!");
                break;
            } else {
                System.out.println("Please answer with Y or N");
            }
        }

        System.out.println("It's time to pack for your trip to Mars.");
        System.out.println("How many suitcases do you plan to bring?");
        int count = 0;
        while (true) {
            String suitcases = input.nextLine();
            try {
                count = Integer.parseInt(suitcases);
            } catch (Exception e) {
                System.out.println("Please enter a number.");
                continue;
            }
            break;
        }
        if (count < 2) {
            System.out.println("Wow! You sure know how to pack light.");
        } else if (count == 2) {
            System.out.println("That's perfect!");
        } else if (count > 2) {
            System.out.println("That's way too many. You'll have to pack more lightly.");
            System.out.println("Please try to fit your stuff into 2 suitcases.");
        }

        System.out.println("You're allowed to bring one companion animal with you.");
        System.out.println("What kind of companion animal would you like to bring?");
        String companion = input.nextLine();

        System.out.println("What is your companion's name?");
        String companionName = input.nextLine();
        System.out.println("Cool, so you're bringing " + companionName + " the " + companion + ".");


        Map<String, String> decorChoices = new HashMap<>();
        decorChoices.put("A", "sleek, modern, minimalist");
        decorChoices.put("B", "retro, vintage, space age");
        decorChoices.put("C", "hippie chic");

        System.out.println("NASA has a interior design team offering to outfit your space ship.");
        System.out.println("You have a couple of options for the interior decor of your ship.");
        System.out.println("Your options are:");
        System.out.println(" A  Sleek, modern minimalism");
        System.out.println(" B  Retro/vintage space age");
        System.out.println(" C  SF Hippie chic");
        System.out.println("Which decor would you like? Choose A, B, or C.");
        String decorChoice;
        while (true) {
            String decor = input.nextLine();
            String decorInput = decor.toUpperCase();
            if (decorChoices.containsKey(decorInput)) {
                decorChoice = decorChoices.get(decorInput);
                break;
            } else {
                System.out.println("Please enter A, B, or C");
            }
        }

        System.out.println("I can see it now...");
        System.out.println(name + " and " + companionName + " surfing the celestial abyss...");
        System.out.println("in a " + decorChoice + " spaceship.");
        System.out.println(name + " -- the day is here!");
        System.out.println("You crawl into the spaceship with " + companionName);
        System.out.println("Brace for take off!");
        System.out.println("5 ...");
        System.out.println("4 ...");
        System.out.println("3 ...");
        System.out.println("2 ...");
        System.out.println("1 ...");
        System.out.println("* LIFTOFF *");
    }
}
