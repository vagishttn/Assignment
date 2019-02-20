package JavaSession1;/*Q10.Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String*/

public class OverLoading {

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static double add(double num1, double num2) {
        return num1 + num2;
    }


    static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static String concatenate(String first, String second) {
        return first + second;
    }

    static String concatenate(String first, String second, String third) {
        return first + second + third;
    }

    public static void main(String[] args) {
        System.out.println(add(12, 14));
        System.out.println(add(12.5, 14.5));
        System.out.println(add(11.0, 14.0));

        System.out.println(multiply(2, 4));
        System.out.println(multiply(2.5f, 4.5f));

        System.out.println(concatenate("Vagish ", " Dixit"));
        System.out.println(concatenate("Hello ", " Vagish ", " Dixit"));


    }
}
