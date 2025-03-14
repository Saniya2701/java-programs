import java.util.*;  

class Addition {     
    public static void main(String[] args) {
        int a, b, c;   
        Scanner sc = new Scanner(System.in);  

        
        System.out.print("Enter value of a: ");
        a = sc.nextInt();
        
        System.out.print("Enter value of b: ");
        b = sc.nextInt();

        
        c = a + b;

        
        System.out.println("Addition = " + c);

        sc.close(); 
    }
}
