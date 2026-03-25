// Create a class Employee (id, name, department, salary). The program should write an
// employee object to a file. Retrieve the stored information and display the details as a formatted output.

import java.io.*;

class Employee implements Serializable {
    int id;
    String name, dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class Pg27_EmployeeFile {
    public static void main(String[] args) throws Exception {

        // Writing object
        Employee e = new Employee(1, "Bella", "IT", 30000);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.txt"));
        oos.writeObject(e);
        oos.close();

        // Reading object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.txt"));
        Employee emp = (Employee) ois.readObject();
        ois.close();

        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.id);
        System.out.println("Name: " + emp.name);
        System.out.println("Dept: " + emp.dept);
        System.out.println("Salary: " + emp.salary);
    }
}

/*
Sample Output:

Employee Details:
ID: 1
Name: Bella
Dept: IT
Salary: 30000.0
*/