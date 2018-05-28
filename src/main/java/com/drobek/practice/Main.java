package com.drobek.practice;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String... arg) {
// some examples of palindrome strings:
        //A car, a man, a maraca
        //A Santa at Nasa
        //A lad named E. Mandala
        //A tin mug for a jar of gum nita
        //civic
        //level
        //rotor

        System.out.println("Enter word or phrase to check if palindrome");
        String input = reader.nextLine();

        StringBuilder lastHalf = new StringBuilder();
        String wordNoSpace = input.replace(" ", "").replace("'", "").replace(",", "").replace(".","").toLowerCase();
        int len = wordNoSpace.length();
        int inHalf = wordNoSpace.length() / 2;
        String firstHalf = " ";


// This will check if palindrome when string has even number index
        if (wordNoSpace.length() % 2 == 0) {
            String lastHalfBackward = wordNoSpace.substring(inHalf + 1, len);
            firstHalf = wordNoSpace.substring(0, inHalf - 1);
            for (int index = lastHalfBackward.length() - 1; index >= 0; index--) {
                lastHalf.append(lastHalfBackward.charAt(index));

            }
            if (lastHalf.toString().equals(firstHalf)) {
                System.out.println("True: "+ "'" + input+ "'" + " : is a palindrome");
            } else {
                System.out.println("'" + input+ "'" + " is not a palindrome");
            }

        }



// This will check if palindrome when string has odd number index
        if (wordNoSpace.length() % 2 != 0) {
            String lastHalfBackward = wordNoSpace.substring(inHalf + 1, len);
            firstHalf = wordNoSpace.substring(0, inHalf);
            for (int index = lastHalfBackward.length() - 1; index >= 0; index--) {
                lastHalf.append(lastHalfBackward.charAt(index));

            }
            if (lastHalf.toString().equals(firstHalf)) {
                System.out.println("True: "+ "'" + input+ "'" + " : is a palindrome");
            } else {
                System.out.println("'" + input+ "'"+ " is not a palindrome");
            }


        }



    }
}
// System.out.println(firstHalf + " this is the first half");
//         System.out.println(lastHalf + " this is the last half stringbuilder");