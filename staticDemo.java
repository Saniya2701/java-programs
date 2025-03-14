public class StaticDemo {
    
    static int count = 0;

    
    static {
        System.out.println("Static block executed. Initializing static variable...");
        count = 100;  
    }     

    
    public static void displayCount() {
        System.out.println("Current count value: " + count);
    }

    
    public StaticDemo() {
        count++; 
    }

    
    public static void main(String[] args) {
        StaticDemo.displayCount();  

    
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        
        StaticDemo.displayCount();
    }
}
