public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();

        Book book2 = new Book("Hamlet", "William Shakeaspeare");

        Book book3 = new Book("Pride and Prejudice", "Jane Austen", 50.00f);

        System.out.println("Book 1 title = " + book1.getTitle() + ", book 1 author = " + book1.getAuthor() + ", book 1 price = " + book1.getPrice());
        System.out.println("Book 2 title = " + book2.getTitle() + ", book 2 author = " + book2.getAuthor() + ", book 2 price = " + book2.getPrice());
        System.out.println("Book 3 title = " + book3.getTitle() + ", book 3 author = " + book3.getAuthor() + ", book 3 price = " + book3.getPrice());
    }
}