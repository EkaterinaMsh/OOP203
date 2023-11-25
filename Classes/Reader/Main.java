public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "Математический", "01.01.2001", "12345678");
        Reader reader2 = new Reader("Иванов А. А.", 2, "Ин. яз", "02.02.2002", "87654321");

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"), new Book("Энциклопедия", "Автор3"));

        reader2.returnBook(2);
        reader2.returnBook("Роман", "Детектив");
        reader2.returnBook(new Book("Роман", "Автор4"), new Book("Детектив", "Автор5"));
    }
}