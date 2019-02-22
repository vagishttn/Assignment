package session2.library.management;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Librarian extends Person {

    private LocalDate joiningDate;

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Librarian(String name, int id, LocalDate joiningDate) {
        super(name, id);
        this.joiningDate = joiningDate;
    }

    @Override
    public void getDetails() {
        System.out.println("Name : " + this.getName());
        System.out.println("Id : " + this.getId());
        System.out.println("Date Of Joining : " + this.getJoiningDate());
    }
}
