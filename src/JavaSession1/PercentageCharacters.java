package JavaSession1;/* Question 4: Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String*/


import java.util.Scanner;

public class PercentageCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String inputString = sc.nextLine();
        System.out.println("Computation of Characters in String are");
        characterCalculations(inputString);
    }

    private static void characterCalculations(String inputString) {

        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int specialChar = 0;
        int size = inputString.length();
        for (int i = 0; i < size; i++) {
            char ch = inputString.charAt(i);

            if(Character.isUpperCase(ch))
                upperCase++;
            else if(Character.isLowerCase(ch))
                lowerCase++;
            else if(Character.isDigit(ch))
                digit++;
            else if(Character.isWhitespace(ch))
                continue;
            else
                specialChar++;
        }
        double upperCasePercentage = calculatePercentage(upperCase,size);
        double lowerCasePercenatge = calculatePercentage(lowerCase,size);
        double digitPercentage = calculatePercentage(digit,size);
        double specialCharPercentage = calculatePercentage(specialChar,size);


        System.out.println("Upper Case ->  Number : "+upperCase +"  Percentage : "+upperCasePercentage);
        System.out.println("Lower Case ->  Number : "+lowerCase +"  Percentage : "+lowerCasePercenatge);
        System.out.println("Digit ->  Number : "+digit +"  Percentage : "+digitPercentage);
        System.out.println("Special Characters ->  Number : "+specialChar +"  Percentage : "+specialCharPercentage);
    }

    private static double calculatePercentage(int number, int size) {
        return (number*100)/size;
    }

}
