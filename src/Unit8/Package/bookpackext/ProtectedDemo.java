package Unit8.Package.bookpackext;

public class ProtectedDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];

        books[0] = new ExtBook("Java: А Beginner's Guide",
                "Schildt", 2007, "Osborne/McGraw-Hill");
        books[1] = new ExtBook("Java: The Complete Reference",
                "Schildt", 2007, "Osborne/McGraw-Hill");
        books[2] = new ExtBook("The Art of Java",
                "Schildt and Holmes", 2003,
                "Osborne/McGraw-Hill");
        books[3] = new ExtBook("Red Storm Rising",
                "Clancy", 1986, "Putnam");
        books[4] =  new ExtBook("On the Road",
            "Kerouac", 1955, "Viking");

        for (Unit8.Package.bookpackext.ExtBook res : books) {
            res.show();
        }

        // Поиск книг по автору
        System.out.println("Showing all books by Sсhildt.");
        for (ExtBook book : books) {
            if (book.getAuthor().equals("Schildt")) {
                System.out.println(book.getTitle());
            }
        }

        // books[0].title = "test title"; // Ошибка доступа
    }
}
