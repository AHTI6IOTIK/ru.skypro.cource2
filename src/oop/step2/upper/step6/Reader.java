package oop.step2.upper.step6;

import java.util.Date;

public class Reader {
    private String fullName;
    private String readerTicketNumber;
    private String faculty;
    private Date birthDate;
    private String phone;

    public Reader(String fullName, String readerTicketNumber, String faculty, Date birthDate, String phone) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook() {
        System.out.printf(
            "%s взял 1 книгу",
            fullName
        );
    }

    public void takeBook(String bookName) {
        System.out.printf(
            "%s взял книгу: %s",
            fullName,
            bookName
        );
    }

    public void returnBook() {
        System.out.printf(
            "%s вернул 1 книгу",
            fullName
        );
    }

    public void returnBook(String bookName) {
        System.out.printf(
            "%s вернул книгу: %s",
            fullName,
            bookName
        );
    }
}
