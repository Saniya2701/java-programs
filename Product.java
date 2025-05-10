package Ecommerce;
import java.util.scanner;

public class Product{

public void name(){

        Scanner sc = new Scanner(System.in);
        String n;
        System.out.print("Enter a name: ");
        n = sc.nextLine();
        System.out.println("Product name: " + n);
    }

public void Price(){
      
       Scanner sc = new Scanner(System.in);
       int p;
       System.out.println("Enter a Price: ");
       p = sc.nextLine();
       System.out.println("product Price:" + p);
  }

} 



