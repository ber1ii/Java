public class TestApp {
    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", "J.R.R", "Tolkien", 1937, 310);
        Book book2 = new Book("A Game of Thrones", "George", "R.R Martin", 1996, 694);
        Book book3 = new Book("Foundation", "Isaac", "Asiimov", 1951, 272);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        LibraryArchive archive = new LibraryArchive("Library");
        archive.add(book1);
        archive.add(book2);
        archive.add(book3);

        System.out.println(archive);

        if (archive.add(book1) == false) {
            System.out.println("Trying to add duplicate of The Hobbit failed(return code false)");
        }

        archive.remove("The Hobbit");

        int booksLongerThan = archive.longerThan(300);
        System.out.println("There are " + booksLongerThan + " books longer than 300 pages");

        System.out.println(archive);
    }
}
