import java.util.Scanner;

class Stack {

    int size = 5;
    int Stk[] = new int[size];
    int i, ele, top;

    Stack() {
        top = -1;
    }

    void push() {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter element to push: ");
            ele = sc.nextInt();
            top++;
            Stk[top] = ele;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            ele = Stk[top];
            top--;
            System.out.println("Popped element: " + ele);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(Stk[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        int select;

        do {
            System.out.println("\n1. Push\n2. Pop\n3. Display");
            System.out.print(": Select from following: ");
            select = sc.nextInt();

            switch (select) {
                case 1: s.push(); break;
                case 2: s.pop(); break;
                case 3: s.display(); break;
                default: System.out.println("Invalid choice! Please try again.");
            }
        } while (select != 3);
    }
}
