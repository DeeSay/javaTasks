public class Main {
    public static void main(String[] args) {
        Author a = new Author("Alex Brown", "alxb@gmail.com", 'М');
        System.out.println(a.toString());
        Book b = new Book("Clean code", a, 24.55, 2);
        System.out.println(b.toString());
    }
}