class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;
    Employee(String employeeName, String employeeAddress, double employeeSalary, String employeeJobTitle) {
        name = employeeName;
        address = employeeAddress;
        salary = employeeSalary;
        jobTitle = employeeJobTitle;
    }
    void calculateBonus() {
        System.out.println(jobTitle + " " + name + " receives a bonus of: " + (salary * 0.10));
    }
    void generatePerformanceReport() {
        System.out.println("Generating performance report for " + jobTitle + " " + name);
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}
class Manager extends Employee {
    int numberOfReports;
    Manager(String employeeName, String employeeAddress, double employeeSalary, String employeeJobTitle, int numberOfReports) {
        super(employeeName, employeeAddress, employeeSalary, employeeJobTitle);
        this.numberOfReports = numberOfReports;
    }
    void calculateBonus() {
        double bonus = salary * 0.15 + (numberOfReports * 50);
        System.out.println(jobTitle + " " + name + " receives a bonus of: " + bonus);
    }
    void manageProjects() {
        System.out.println(jobTitle + " " + name + " is managing projects.");
    }
}
class Developer extends Employee {
    String programmingLanguage;
    Developer(String employeeName, String employeeAddress, double employeeSalary, String employeeJobTitle, String employeeProgrammingLanguage) {
        super(employeeName, employeeAddress, employeeSalary, employeeJobTitle);
        programmingLanguage = employeeProgrammingLanguage;
    }
    void calculateBonus() {
        double bonus = salary * 0.12;
        System.out.println(jobTitle + " " + name + " receives a bonus of: " + bonus);
    }
    void developSoftware() {
        System.out.println(jobTitle + " " + name + " is developing software using " + programmingLanguage + ".");
    }
}
class Programmer extends Developer {
    String project;
    Programmer(String employeeName, String employeeAddress, double employeeSalary, String employeeJobTitle, String employeeProgrammingLanguage, String employeeProject) {
        super(employeeName, employeeAddress, employeeSalary, employeeJobTitle, employeeProgrammingLanguage);
        project = employeeProject;
    }
    void calculateBonus() {
        double bonus = salary * 0.10 + 200;
        System.out.println(jobTitle + " " + name + " receives a bonus of: " + bonus);
    }
    void writeCode() {
        System.out.println(jobTitle + " " + name + " is writing code for the " + project + " project.");
    }
}
class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("ABC", "123 Main St", 95000, "Manager", 5);
        Developer developer = new Developer("XYZ", "456 Oak St", 80000, "Developer", "Java");
        Programmer programmer = new Programmer("PQR", "789 Pine St", 70000, "Programmer", "Python", "Website Redesign");
        manager.displayDetails();
        manager.calculateBonus();
        manager.generatePerformanceReport();
        manager.manageProjects();
        System.out.println();
        developer.displayDetails();
        developer.calculateBonus();
        developer.generatePerformanceReport();
        developer.developSoftware();
        System.out.println();
       programmer.displayDetails();
        programmer.calculateBonus();
        programmer.generatePerformanceReport();
        programmer.writeCode();
    }
}

