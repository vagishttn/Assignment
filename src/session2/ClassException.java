/*WAP to produce ClassNotFoundException exception.*/

package session2;

public class ClassException {

    public static void ClassNotFoundExceptionMethod() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ClassNotFoundExceptionMethod();
    }
}
