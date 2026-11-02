
package com.library.model;

import java.time.LocalDate;

public class IssueRecord {

    private int issueId;
    private int bookId;
    private int studentId;
    private LocalDate issueDate;
    private LocalDate returnDate;
    private String status;

    // Parameterized constructor
    public IssueRecord(int issueId, int bookId, int studentId) {

        this.issueId = issueId;
        this.bookId = bookId;
        this.studentId = studentId;

        this.issueDate = LocalDate.now();
        this.returnDate = null;
        this.status = "ISSUED";
    }

    // Getters and Setters
    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Return book functionality
    public void returnBook() {

        if (status.equals("ISSUED")) {

            this.returnDate = LocalDate.now();
            this.status = "RETURNED";

            System.out.println("Book returned successfully!");

        } else {

            System.out.println("Book already returned!");
        }
    }

    // Display issue details
    @Override
    public String toString() {
        return "IssueRecord{" +
                "issueId=" + issueId +
                ", bookId=" + bookId +
                ", studentId=" + studentId +
                ", issueDate=" + issueDate +
                ", returnDate=" + returnDate +
                ", status='" + status + '\'' +
                '}';
    }
}
