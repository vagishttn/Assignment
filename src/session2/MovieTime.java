/*Q4:WAP to create singleton class.*/

package session2;

import java.util.HashSet;
import java.util.Set;

public class MovieTime {

    private static final MovieTime show = new MovieTime();

    private Set<String> availableSeats;

    public static MovieTime getInstance() {
        return show;
    }

    private void show() {
        availableSeats = new HashSet<>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    private static void ticketAgentBook(String seat) {
        MovieTime show = MovieTime.getInstance();
        System.out.println(show.bookSeat(seat.toString()));
    }

    public static void main(String[] args) {
        ticketAgentBook("1A");
    }

}
