/*Q6. WAP showing try, multi-catch and finally blocks.*/
package session2;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator : ");
        int numerator = sc.nextInt();
        System.out.println("Enter Denominator : ");
        int denominator = sc.nextInt();

        exceptionHandler(numerator, denominator);

    }

    private static void exceptionHandler(int numerator, int denominator) {

        try {
            System.out.println("The Result is : " + numerator / denominator);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Finally Block");
        }

    }

}
