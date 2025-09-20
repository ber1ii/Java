public class Book {
    private String title;
    private Author author;
    private int year;
    private int pages;

    public Book(String title, String firstName, String lastName, int year, int pages) {
        this.title = title;
        this.author = new Author(firstName, lastName);
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append("\n");
        sb.append("Author: ").append(author.toString()).append("\n");
        sb.append("Year: ").append(year).append("\n");
        sb.append("Pages: ").append(pages).append("\n");

        return sb.toString();
    }
}
