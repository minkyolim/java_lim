package ch11;

class Book {
    private String title;
    private String author;

    Book() {
        System.out.println("기본생성자: 제목, 작가");
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("생성자: " + title + author);
    }

    void getBook() {
        System.out.println("getBook: " + title + author);

    }

}


public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("자바를 자바라!", "용쌤");

//        System.out.println("제목: " + book1.title + ", 작가: " + book1.author);
//        System.out.println("제목: " + book2.title + ", 작가: " + book2.author);
        book2.getBook();
    }
}
