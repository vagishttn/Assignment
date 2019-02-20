/*Question 3: Write a program to find the number of occurrences of a character in a string without using loop?*/


import java.util.Scanner;

public class CharacterOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input String");
        String inputString = sc.nextLine();

        System.out.println("Enter The Character ");
        char searchChar = sc.next().charAt(0);

        int characterOccurrence = findOccurrence(inputString, searchChar);
        System.out.println("Occurrence of character " + searchChar + "  is -> " + characterOccurrence);


    }

    private static int findOccurrence(String inputString, char searchChar) {
        int length = inputString.length();
        return (length - inputString.replaceAll(Character.toString(searchChar), "").length());
    }


}
