package LibraryManagement;
import java.util.Scanner;

public class Member {

   public void name() {
        Scanner sc = new Scanner(System.in);
         String n;
        System.out.print("Enter member name: ");
        n = sc.nextLine();
        System.out.println("Member Name: " + n);
    }

   public void id() {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.print("Enter member ID: ");
        no = sc.nextInt();
        System.out.println("Member ID: " + no);
    }
}
