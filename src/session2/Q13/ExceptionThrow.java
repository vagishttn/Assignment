/*Q13: Create a custom exception that do not have any stack trace.*/
package session2.Q13;

public class ExceptionThrow {

    public static void main(String[] args) {
        try {
            throw new CustomException("Custom Exception");
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
