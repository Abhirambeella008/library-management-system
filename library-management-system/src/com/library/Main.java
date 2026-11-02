
package com.library;

import com.library.model.Book;
import com.library.model.Student;
import com.library.model.IssueRecord;

public class Main {

    public static void main(String[] args) {

        // 1. Create Book object
        Book book = new Book(
                101,
                "Java Programming",
                "James Gosling",
                450.50,
                5
        );

        // 2. Create Student object
        Student student = new Student(
                501,
                "Abhiram",
                "abhiram@gmail.com",
                "9876543210"
        );

        // 3. Create IssueRecord object
        IssueRecord issue = new IssueRecord(
                1001,
                book.getBookId(),
                student.getStudentId()
        );

        // 4. Display Book details
        System.out.println("===== BOOK DETAILS =====");
        System.out.println(book);

        // 5. Display Student details
        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println(student);

        // 6. Display Issue details
        System.out.println("\n===== ISSUE DETAILS =====");
        System.out.println(issue);

        // 7. Return Book
        System.out.println("\n===== RETURN BOOK =====");
        issue.returnBook();

        // 8. Display updated Issue details
        System.out.println("\n===== UPDATED ISSUE DETAILS =====");
        System.out.println(issue);
    }
}
