/*Now that your personal digital therapist, Eliza, is up and running, it's time to step it up with some Easter Eggs.



        If you type "pig" Eliza should begin speaking in pig latin (Source: https://en.wikipedia.org/wiki/Pig_Latin (Links to an external site.)Links to an external site.).

        Pig Latin Rules:

        If the first letter is a consonant, add "ay" to the end
        If the first letter is a vowel, add "way" or "tay" to the end
        Don't worry about the "multiple-letters-that-sounds-like one" rule (ex. str-, ch-, th-, etc.)

        Additional Features:

        If you type "caps" Eliza should begin speaking in all caps.

        If you type "play game" Eliza should allow you to play a game, such as your choose your own adventure game.

        If you type in "red" Eliza 's text should be displayed in red.

        At the end of the chat, print out the chat history.*/


package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nGood day. What is your question");

            String choice = input.nextLine();

            switch (choice) {

                case "pig":
                    pigLatin();
                    break;

                    case "caps":
                    capsAll();
                    break;

                case "play game":
                    playGame();
                    break;

                case "red":
                    redAll();
                    break;

                    default:
                        userInput();
                        break;
            }
        }
    }


    public static void pigLatin() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nYou've entered pig latin mode. Enter your question");

        String strIn = input.nextLine();

        for (String strVal : strIn.split(" ")) {

            String[] strSplit = strIn.split(" ");

            if (strVal.charAt(0) == 'a' | strVal.charAt(0) == 'e' | strVal.charAt(0) == 'i' | strVal.charAt(0) == 'o' | strVal.charAt(0) == 'u' | strVal.charAt(0) == 'A' |
                    strVal.charAt(0) == 'E' | strVal.charAt(0) == 'I' | strVal.charAt(0) == 'O' | strVal.charAt(0) == 'U') {
                Random rnd = new Random();

                if (rnd.nextBoolean()) {
                    System.out.print(strVal + "" + "way" + " ");
                } else {
                    System.out.print(strVal + "" + "tay" + " ");
                }
            } else {
                System.out.print(strVal + "" + "ay" + " ");
            }

        }
    }


    public static void capsAll() {

        Scanner input = new Scanner(System.in);
        System.out.println("\nYou've entered caps mode. Enter your question");
        String strIn = input.nextLine();
        String convertedStr = "";

        convertedStr = strIn.toUpperCase();
        System.out.print(convertedStr);
    }


    public static void playGame() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nLet's play Magic 8-ball game. What is your question ?");

        String askQues = input.nextLine();

        System.out.println("YOU ASKED:\t" + askQues);

        System.out.println("MAGIC 8 BALL SAYS:");

        ArrayList<String> MagicAnswer = new ArrayList<>();

        MagicAnswer.add("● It is certain");
        MagicAnswer.add("● It is decidedly so");
        MagicAnswer.add("● Yes definitely");
        MagicAnswer.add("● You may rely on it");
        MagicAnswer.add("● As I see it, yes");
        MagicAnswer.add("● Most likely");
        MagicAnswer.add("● Outlook good");
        MagicAnswer.add("● Yes");
        MagicAnswer.add("● Signs point to yes");
        MagicAnswer.add("● Reply hazy try again");
        MagicAnswer.add("● Ask again later");
        MagicAnswer.add("● Better not tell you now");
        MagicAnswer.add("● Cannot predict now");
        MagicAnswer.add("● Concentrate and ask again");
        MagicAnswer.add("● Don't count on it");
        MagicAnswer.add("● My reply is no");
        MagicAnswer.add("● My sources say no");
        MagicAnswer.add("● Outlook not so good");
        MagicAnswer.add("● Very doubtful");

        Collections.shuffle(MagicAnswer);
        System.out.println(MagicAnswer.get(0));
    }


    public static void redAll() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the line to print in red");

        String strIn = input.nextLine();

        System.out.println("\u001B[31m"+strIn);
        System.out.println("\u001B[30m");
    }


    public static void userInput(){

    Scanner input = new Scanner(System.in);

    String str;
    String convertedStr;// output the input by changing the words

    ArrayList<String> addedHedges = new ArrayList<>(); // arraylist for hedges

    addedHedges.add("Please tell me more");

    addedHedges.add("Many of my patients tell me the same thing");

    addedHedges.add("It is getting late, maybe we had better quit");


    ArrayList<String> addedQualifiers = new ArrayList<>(); //arraylist for qualifiers

    addedQualifiers.add("Why do you say that");

    addedQualifiers.add("You seem to think that");

    addedQualifiers.add("So, you are concerned that");

    HashMap<String, String> wordReplace = new HashMap<String, String>();

    wordReplace.put("i", "you");
    wordReplace.put("me", "you");
    wordReplace.put("my", "your");
    wordReplace.put("am", "are");

    while (true) {

        System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
        str = input.nextLine();
        convertedStr = "";

        if ((str.equalsIgnoreCase("q")) | (str.equalsIgnoreCase("i am feeling great"))) {

            break;

        }

        else {

            for (String retval : str.split(" ")) {

                String[] retVal = str.split(" ");

                if (wordReplace.containsKey(retval)) {

                    convertedStr += wordReplace.get(retval) + " ";
                } else {

                    convertedStr += retval + " ";
                }
            }

            Collections.shuffle(addedHedges); }// shuffle hedges
        Collections.shuffle(addedQualifiers);

        Random rnd = new Random();

        if (rnd.nextBoolean()){
            System.out.println(addedHedges.get(0)); //output qualifiers from arraylist + the converted string
        }
        else {
            System.out.println(addedQualifiers.get(0) + " " + convertedStr);
        }

    }
}
}















