package LibraryManagement;
import java.util.Scanner;

public class Book {
    
   public void title() {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.print("Enter a title: ");
        n = sc.nextLine();
        System.out.println("Book Title: " + n);
    }

  public void author() {
        Scanner sc = new Scanner(System.in);
         String a;
        System.out.print("Enter author name: ");
        a = sc.nextLine();
        System.out.println("Author Name: " + a);
    }

  public void ISBN() {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.print("Enter book register number: ");
        no = sc.nextInt();
        System.out.println("Book ISBN: " + no);
    }
}



