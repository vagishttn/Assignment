/*8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
a)while statement
b)do-while statement*/

package session2;

import java.util.HashMap;
import java.util.Scanner;

public class ReadUntilDone {

    static Scanner sc = null;
    private static final String DONE = "done";

    public static void main(String[] args) {

        System.out.println("Using While");
        HashMap<String, Boolean> mapWhile = readUsingWhile();
        System.out.println(mapWhile);

        System.out.println();

        System.out.println("Using Do-While");
        HashMap<String, Boolean> doWhileMap = readUsingDo();
        System.out.println(doWhileMap);


    }

    private static HashMap<String, Boolean> readUsingWhile() {

        sc = new Scanner(System.in);
        HashMap<String, Boolean> mapWhile = new HashMap<>();
        String inputString = null;
        while (!((DONE).equals(inputString))) {
            System.out.println("Enter The String");
            inputString = sc.next();
            if (!(inputString.equals(DONE)))
                mapWhile.put(inputString, inputString.charAt(0) == inputString.charAt(inputString.length() - 1));
        }
        return mapWhile;
    }

    private static HashMap<String, Boolean> readUsingDo() {
        sc = new Scanner(System.in);
        HashMap<String, Boolean> mapDo = new HashMap<>();
        String inputString=null;
        do {
            System.out.println("Enter The String");
            inputString = sc.next();
            if (!(inputString.equals(DONE)))
                mapDo.put(inputString, inputString.charAt(0) == inputString.charAt(inputString.length() - 1));
        } while (!((DONE).equals(inputString)));

        return mapDo;

    }
}
