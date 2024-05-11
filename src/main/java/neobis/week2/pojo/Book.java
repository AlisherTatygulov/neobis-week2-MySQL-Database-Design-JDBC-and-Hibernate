package neobis.week2.pojo;

public class Book {
        private int id;
        private String title;
        private String author;
        private String genre;
        private double price;
        private int quantityAvailable;

        public Book() {
        }

        public Book(int bookId, String title, String author, String genre, double price, int quantityAvailable) {
            this.id = bookId;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.price = price;
            this.quantityAvailable = quantityAvailable;
        }

        public int getBookId() {
            return id;
        }

        public void setBookId(int bookId) {
            this.id = bookId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantityAvailable() {
            return quantityAvailable;
        }

        public void setQuantityAvailable(int quantityAvailable) {
            this.quantityAvailable = quantityAvailable;
        }

}
