package Unit8.Package.bookpack;

class Book {
    private String title;
    private String author;
    private int pubDate;

    Book(String title, String author, int pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java: A Beginner's Guide", "Shildt", 2014);
        books[1] = new Book("Java: The Complte Reference", "Shildt", 2014);
        books[2] = new Book("The Art of Java", "Shildt", 2003);
        books[3] = new Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book("On The Road", "Kerouac", 1995);

        for (Book res :
                books) {
            res.show();
        }
    }
}
