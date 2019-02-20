package JavaSession1;
/*Question 7:Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively*/

public class StaticQuestion {

    private static String firstName = "Vagish";
    private static String lastName = " Dixit";
    private static int age = 24;

    static {
        System.out.println("-------------Printing Through Static Block-----------------");
        System.out.println("First Name is : Vagish ");
        System.out.println("Last Name is : Dixit");
        System.out.println("Age is : 23");
    }

    public static void userInfo() {
        System.out.println("-------------Printing Through Static Method-----------------");
        System.out.println("First Name is : Vagish ");
        System.out.println("Last Name is : Dixit");
        System.out.println("Age is : 23");
    }

    public static void main(String[] args) {

        System.out.println("-------------Printing Through Static Variables-----------------");
        System.out.println("First Name is : " + StaticQuestion.firstName);
        System.out.println("Last Name is : " + StaticQuestion.lastName);
        System.out.println("Age is : " + StaticQuestion.age);

        StaticQuestion.userInfo();


    }
}
