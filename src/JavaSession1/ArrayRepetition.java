package JavaSession1;/*Question 6: There is an array with every element repeated twice except one. Find that element*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayRepetition {

    public static void main(String[] args) {

        int[] integerArray;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int arraySize = sc.nextInt();
        integerArray = new int[arraySize];
        insertInArray(integerArray, arraySize);
        System.out.println("Element Which Is Repeated Once In Array : " + repeatedElementHashMap(integerArray, arraySize));


    }

    private static int repeatedElement(int[] integerArray, int arraySize) {
        Arrays.sort(integerArray);
        int i = 0;
        while (i < arraySize) {
            if (integerArray[i] != integerArray[i + 1]) {
                return integerArray[i];
            }
            i+=2;
        }
        return -1;
    }

    private static int repeatedElementHashMap(int[] integerArray, int arraySize) {
        HashMap<Integer, Integer> integerMap = new HashMap<>(arraySize);
        for (int num :
                integerArray) {
            Integer numberOccurence = integerMap.get(num);

            integerMap.put(num, numberOccurence == null ? 1 : numberOccurence + 1);
        }
        for (Map.Entry<Integer, Integer> element :
                integerMap.entrySet()) {
            if (element.getValue() == 1)
                return element.getKey();
        }
        return -1;
    }

    private static void insertInArray(int[] array, int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Element at " + i + " th position: ");
            array[i] = sc.nextInt();
        }
    }
}
