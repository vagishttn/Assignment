package JavaSession1;/*Question 2: Write a program to find the number of occurrences of the duplicate words in a string and print them*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordOccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String inputString = sc.nextLine();

        System.out.println("Character Ocuurrence are: ");
        getWordCount(inputString, inputString.length());

    }

    private static void getWordCount(String inputString, int length) {

        String[] stringArray = inputString.split("\\s+");
        HashMap<String, Integer> stringMap = new HashMap<>(length);
        for (String element :
                stringArray) {
            Integer occurrence = stringMap.get(element);
            stringMap.put(element, occurrence == null ? 1 : occurrence + 1);
        }
        printOccurrence(stringMap);

    }

    private static void printOccurrence(HashMap<String, Integer> stringMap) {
        for (Map.Entry<String, Integer> map :
                stringMap.entrySet()) {
            System.out.println(map.getKey() + "  ----->  " + map.getValue());
        }
    }
}
