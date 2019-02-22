/*Q11. Convert the following code so that it uses nested while statements instead of for statements: */
package session2;


public class WhileFromFor {

    public static void main(String[] args) {
        int s = 0;
        int t = 1;
        int i = 0;
        while (i < 10) {
            s = s + i;
            int j = i;
            while (j > 0) {

                t = t * (j - i);
                j--;
            }
            s = s * t;
            i++;

            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);
    }
}
