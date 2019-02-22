package session2.library.management;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.setLibraryLocation("Rajiv Chowk");
        Book book1 = new Book("Head First Java", "Eric S", 700.0f);
        Book book2 = new Book("Head First Design Patterns", "Donald Y", 900.0f);
        Book book3 = new Book("Head First HTML5 Programming", "David P", 800.0f);
        Book book4 = new Book("Head First HTML & CSS", "Henry T", 600.0f);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        myLibrary.setBooksInLibrary(bookList);

        Librarian librarian = new Librarian("Surbhi  Garg", 3284, LocalDate.of(2017, 02, 02));
        myLibrary.setLibrarian(librarian);

        Member member1 = new Member("Vagish Dixit", 3338, "vd@gmail.com", LocalDate.of(2015, 02, 02), LocalDate.of(2030, 02, 02));
        Member member2 = new Member("Prateek Nagar ", 3339, "pn@gmail.com", LocalDate.of(2018, 02, 02), LocalDate.of(2015, 02, 02));
        Member member3 = new Member("Gagan Kushwaha", 3340, "gk@gmail.com", LocalDate.of(2017, 02, 02), LocalDate.of(2021, 02, 02));

        ArrayList<Member> memberList = new ArrayList<>();
        memberList.add(member1);
        memberList.add(member2);
        memberList.add(member3);
        myLibrary.setMembersOfLibrary(memberList);
        myLibrary.getLibraryDetails();
    }
}
