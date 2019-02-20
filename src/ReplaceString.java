/*Question 1: Write a program to replace a substring inside a string with other string ?*/

import java.util.Scanner;

public class ReplaceString {

    private static String replaceString(String orignalString, String replacementString, String newString)
    {
        return orignalString.replace(replacementString,newString);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter First String:");
        String firstString  = in.nextLine();

        System.out.println("Enter String to be replaced:");
        String replacementString = in.nextLine();

        System.out.println("Enter New Sub String:");
        String newString = in.nextLine();

        System.out.println("New String is : "+ replaceString(firstString,replacementString,newString));

    }
}
