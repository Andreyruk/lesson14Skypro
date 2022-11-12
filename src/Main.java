public class Main {
    public static void main(String[] args) {
        // Домашнее задание 14 (продолжение задания 13).
        System.out.println("Домашнее задание 14.");

        task1();
    }

    private static void task1() {
        // Задача 1.
//Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке. Обратите
//внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.
        System.out.println("Задача 1.");
//        Author author1 = new Author("Александр", "Пушкин"); или сразу в book1 (см. ниже) - new Author("Александр", "Пушкин")
        Author author2 = new Author("Алексей", "Толстой");

        Book book1 = new Book("книга1", new Author("Александр", "Пушкин"), 1812);
        Book book2 = new Book("книга2", author2, 1900);

        book1.setYearPublic(1811);
        book2.setYearPublic(1899);
        System.out.println(book1);
        System.out.println(book2);
//        printBook(book1);
//        printBook(book2);
    }

//    public static void printBook(Book book) {
//        System.out.println(book.getTitleBook() + " " + book.getYearPublic() + " " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
//        System.out.println(book);
//    }
}