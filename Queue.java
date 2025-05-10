import java.util.Scanner;

class Queue {

    int size = 5;
    int Q[] = new int[size];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    void enqueue() {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter element to enqueue: ");
            int ele = sc.nextInt();
            if (front == -1) {
                front = 0; 
            }
            rear++;
            Q[rear] = ele;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            int ele = Q[front];
            System.out.println("Dequeued element: " + ele);
            front++;

            
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.println(Q[i]);
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        int select;

        do {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Display");
            System.out.print(": Select from following: ");
            select = sc.nextInt();

            switch (select) {
                case 1: q.enqueue(); break;
                case 2: q.dequeue(); break;
                case 3: q.display(); break;
                default: System.out.println("Invalid choice! Please try again.");
            }
        } while (select != 3);
    }
}

