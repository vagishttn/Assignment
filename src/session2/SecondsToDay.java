/*Q7. WAP to convert seconds into days, hours, minutes and seconds.*/

package session2;

import java.util.Scanner;

public class SecondsToDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Seconds");
        int seconds = sc.nextInt();
        convertIntoDays(seconds);
    }

    private static void convertIntoDays(int seconds) {

        int day = seconds / (24 * 3600);

        seconds = seconds % (24 * 3600);
        int hour = seconds / 3600;

        seconds %= 3600;
        int minutes = seconds / 60;

        seconds %= 60;
        int second = seconds;

        System.out.println("Days:Hours:Minute:Second --->  " + day + ":" + hour + ":" + minutes + ":" + second);
    }
}
