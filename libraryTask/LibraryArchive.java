import java.util.HashMap;

public class LibraryArchive implements ILibraryArchive {
    private String name;
    private HashMap<String, Book> books;

    public LibraryArchive(String name) {
        this.name = name;
        this.books = new HashMap<>();
    }

    public boolean add(Book b) {
        if (books.containsKey(b.getTitle())) {
            return false;
        }

        books.put(b.getTitle(), b);
        return true;
    }

    @Override
    public int remove(String title) {
        if (books.containsKey(title)) {
            books.remove(title);
            return 1;
        }
        return -1;
    }

    public int longerThan(int pageCount) {
        int bookCount = 0;

        for (Book b : books.values()) {
            if (b.getPages() > pageCount) {
                bookCount++;
            }
        }

        return bookCount;
    }

    @Override
    public String toString() {
        if (books.isEmpty()) {
            return "Archive: " + name + "\nThe archive is empty";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Archive: ").append(name).append("\n");
        sb.append("Total books stored: ").append(books.size()).append("\n");
        sb.append("Books:\n");

        for (Book b : books.values()) {
            sb.append(b.toString()).append("\n");
        }

        return sb.toString();
    }
}
