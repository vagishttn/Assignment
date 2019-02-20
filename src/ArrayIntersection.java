/*Question 5: Find common elements between two arrays.*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIntersection {

    public static void main(String[] args) {

        int[] firstArray;
        int[] secondArray;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of First Array");
        int firstArraySize = sc.nextInt();
        firstArray = new int[firstArraySize];
        insertInArray(firstArray, firstArraySize);


        System.out.println("Enter Size of Second Array");
        int secondArraySize = sc.nextInt();
        secondArray = new int[firstArraySize];
        insertInArray(secondArray, secondArraySize);


        ArrayList<Integer> intersectionElement = arrayIntersection(firstArray, secondArray);

        System.out.println("First Array is : ");
        printArray(firstArray);

        System.out.println("Second Array is : ");
        printArray(secondArray);

        System.out.println("Intersected Element Are:");
        intersectionElement.forEach(System.out::println);


    }

    private static ArrayList<Integer> arrayIntersection(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> elementList = new ArrayList<>();
        for (int firstElement :
                firstArray) {
            for (int secondElement : secondArray) {
                if (firstElement == secondElement)
                    elementList.add(firstElement);
            }
        }
        return elementList;
    }

    private static void insertInArray(int[] array, int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Element at " + i + "th position: ");
            array[i] = sc.nextInt();
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Array Is:");
        for (int element : array
        ) {
            System.out.print("   " + element);
        }
        System.out.println();
    }


}
