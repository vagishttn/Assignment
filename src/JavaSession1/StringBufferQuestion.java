package JavaSession1;/*Question 8: Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer*/

import java.util.Scanner;

public class StringBufferQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String inputString = sc.nextLine();
        reverseAndDelete(inputString);
    }

    private static void reverseAndDelete(String inputString) {
        StringBuffer newString = new StringBuffer(inputString);
        StringBuffer reverseString = newString.reverse();

        System.out.println("Orginal String Is : " + inputString);
        System.out.println("Reverse String Is : " + reverseString);

        reverseString.delete(4,9);
        System.out.println("String After Deletion from index 4 to 9:");
        System.out.println(reverseString);

    }

}
