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
import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Good day. What is your question");

        String choice = input.nextLine();

        switch (choice) {

            case "pig":
                pigLatin();
                break;

           /* case "caps": capsAll();
                break;

            case "play game": playGame();
            break;

            case "red" : redAll();
            break;*/

            default:
                System.out.println("Invalid");
                break;
        }
    }


    public static void pigLatin() {

        Scanner input = new Scanner(System.in);
        System.out.println("You've entered pig latin mode. Enter your question");
        String strIn = input.nextLine();
        String convertedStr = "";


        for (String strVal : strIn.split(" ")) {

            String[] strSplit = strIn.split(" ");

            if (strVal.charAt(0) == 'a' | strVal.charAt(0) == 'e' | strVal.charAt(0) == 'i' | strVal.charAt(0) == 'o' | strVal.charAt(0) == 'u' | strVal.charAt(0) == 'A' |
                    strVal.charAt(0) == 'E' | strVal.charAt(0) == 'I' | strVal.charAt(0) == 'O' | strVal.charAt(0) == 'U'){

                Random rnd = new Random();

                if (rnd.nextBoolean()){
                    System.out.println(strVal+""+);
                }
            }


        }
    }
}











