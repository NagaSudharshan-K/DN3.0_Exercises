import java.util.*;

public class Main {
    public Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("1", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("2", "To Kill a Mockingbird", "Harper Lee"),
            new Book("3", "1984", "George Orwell"),
            new Book("4", "Moby Dick", "Herman Melville")
        };

        Main lms = new Main();

        System.out.println("Linear Search:");
        Book result = lms.linearSearch(books, "1984");
        System.out.println(result != null ? result.getTitle() + " by " + result.getAuthor() : "Book not found");

        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        System.out.println("Binary Search:");
        result = lms.binarySearch(books, "1984");
        System.out.println(result != null ? result.getTitle() + " by " + result.getAuthor() : "Book not found");
    }
}
