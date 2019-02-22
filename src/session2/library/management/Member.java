package session2.library.management;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Member extends Person {
    private String memberEmail;
    private LocalDate cardIssueDate;
    private LocalDate cardExpiryDate;

    public Member(String name, int id, String memberEmail, LocalDate cardIssueDate, LocalDate cardExpiryDate) {
        super(name, id);
        this.memberEmail = memberEmail;
        this.cardIssueDate = cardIssueDate;
        this.cardExpiryDate = cardExpiryDate;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public LocalDate getCardIssueDate() {
        return cardIssueDate;
    }

    public void setCardIssueDate(LocalDate cardIssueDate) {
        this.cardIssueDate = cardIssueDate;
    }

    public LocalDate getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(LocalDate cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }


    @Override
    public void getDetails() {
        System.out.println("Name : " + this.getName());
        System.out.println("Id : " + this.getId());
        System.out.println("Email : " + this.getMemberEmail());
        System.out.println("Card Issue Date : " + this.getCardIssueDate());
        System.out.println("Card Expiry Date : " + this.getCardExpiryDate());
    }
}
