
// Custom Exception class
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Library class
class Library {
    int availableBooks;

    // Constructor
    Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    // Method to issue books
    void issueBook(int count) throws BookNotAvailableException {

        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully. Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

// Main class
public class LibraryDemo {
    public static void main(String[] args) {

        Library lib = new Library(3);

        try {
            // First issue (valid)
            System.out.println("Issuing 2 books...");
            lib.issueBook(2);

            // Second issue (invalid)
            System.out.println("\nIssuing 2 more books...");
            lib.issueBook(2);

        }
        catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("\nTransaction completed.");
        }
    }
}
