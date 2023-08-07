import java.util.*;

class Book{
    int id;
    double price;
    String name, author, publisher;
    public Book(String name, String author, String publisher, int id, double price ){
        this.name =name;
        this.author = author;
        this.publisher = publisher;
        this.id = id;
        this.price = price;
    }
}
public class Ex8 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        Book b1 = new Book("operating Systems", "Galvin", "Wiley", 1, 300.90);
        Book b2 = new Book("Data Communications", "Forouzan", "Graw Hill", 2, 500.25);
        Book b3 = new Book("Let us C", "Yashwant Kanetkar" , "BPB", 3, 800.77);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for(Book b:list){
            System.out.println(b.id + " " + b.name +" "+ b.author + " "+ b.publisher + " " + b.price);
        }
    }
}
