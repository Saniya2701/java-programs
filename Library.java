import LibraryManagement.Book;
import LibraryManagement.Member;

public class Library {
    public static void main(String[] args) {
        
        Book myBook = new Book();
        Member myMember = new Member();

        
        myBook.title();
        myBook.author();
        myBook.ISBN();

        
        myMember.name();
        myMember.id();
    }
}
