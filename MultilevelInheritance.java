class Student {
    int rollNumber;
    void setRollNumber(int r) {
        rollNumber = r;
    }
    void displayRollNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }
}
class Test extends Student {
    int sub1, sub2;
    void setMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }
    void displayMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Result student = new Result();
        student.setRollNumber(101);
        student.setMarks(85, 90);
        student.displayRollNumber();
        student.displayMarks();
        student.displayResult();
    }
}
