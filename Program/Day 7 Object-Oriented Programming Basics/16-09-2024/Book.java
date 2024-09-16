public class Book {
    private String title;
    private String author;

    // Parameterized constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    // Copy constructor
    public Book(Book other){
        this.title=other.title;
        this.author=other.author;
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }

    public static void main(String[] args) {
        Book b= new Book("Effective Java", "Joshua Bloch");

        Book c = new Book(b);

        System.out.println("Original Book: ");
        b.display();
        System.out.println("Copied Book: ");
        c.display();

        b.title = "Java Concurrency in Practice";
        System.out.println("\n After Modifying the original book title: ");
        System.out.println("Original Book: ");
        b.display();
        System.out.println("Copied Book: ");
        c.display();


    }
}
