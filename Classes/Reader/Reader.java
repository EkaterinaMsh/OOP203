public class Reader {
        private String name;
        private int readerNumber;
        private String faculty;
        private String dateOfBirth;
        private String phone;

        public Reader(String name, int readerNumber, String faculty, String dateOfBirth, String phone) {
            this.name = name;
            this.readerNumber = readerNumber;
            this.faculty = faculty;
            this.dateOfBirth = dateOfBirth;
            this.phone = phone;
        }

        public void takeBook(int bookCount) {
            System.out.println(name + " взял " + bookCount + " книги");
        }

        public void takeBook(String... bookNames) {
            System.out.print(name + " взял книги: ");
            for (String bookName : bookNames) {
                System.out.print(bookName + ", ");
            }
            System.out.println();
        }

        public void takeBook(Book... books) {
            System.out.print(name + " взял книги: ");
            for (Book book : books) {
                System.out.print(book.getName() + "(автор: " + book.getAuthor() + "), ");
            }
            System.out.println();
        }

        public void returnBook(int bookCount) {
            System.out.println(name + " вернул " + bookCount + " книги");
        }

        public void returnBook(String... bookNames) {
            System.out.print(name + " вернул книги: ");
            for (String bookName : bookNames) {
                System.out.print(bookName + ", ");
            }
            System.out.println();
        }

        public void returnBook(Book... books) {
            System.out.print(name + " вернул книги: ");
            for (Book book : books) {
                System.out.print(book.getName() + "(автор: " + book.getAuthor() + "), ");
            }
            System.out.println();
        }
    }

    /*class Book {
        private String name;
        private String author;

        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

    }*/


