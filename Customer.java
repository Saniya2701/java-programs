package Ecommerce;
import java.util.scanner;

public class Customer{

public void name(){

        Scanner sc = new Scanner(System.in);
        String n;
        System.out.print("Enter a name: ");
        n = sc.nextLine();
        System.out.println("Product name: " + n);
    }

public void Address(){
      
       Scanner sc = new Scanner(System.in);
       string a;
       System.out.println("Enter Address: ");
       a = sc.nextLine();
       System.out.println("Address is:" + a);
  }


public void ID(){

     Scanner sc = new Scanner(System.in);
     int id;
     System.out.println("Enter Id:");
     id = sc.nextLine();
     System.out.println("Id is:" + id);
}


} 

