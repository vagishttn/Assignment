/*WAP to sorting string without using string Methods?.*/

package session2;

import java.util.Scanner;

public class StringSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String inputString = sc.nextLine();
        System.out.println("Input String is :" + inputString);
        System.out.println("Sorted String is:  " + sortedString(inputString));
    }

    private static String sortedString(String inputString) {
        char temp = 0;
        char[] charArray = inputString.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] > charArray[i]) {
                    temp = charArray[j];
                    charArray[j] = charArray[i];
                    charArray[i] = temp;
                }
            }
        }
        return new String(charArray);
    }
}
