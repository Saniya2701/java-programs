import java.util.*;
public class factorial {
    

    public static void main(String args[]){
        int n;
    int Fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        Fact=Fact*i;
        
        System.out.println("factorial=" + Fact);
    }

    
}
