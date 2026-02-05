class Person {
    String name, gender, address;
    int age;

    Person(String n, String g, String a, int ag) {
        name = n; 
        gender = g; 
        address = a; 
        age = ag;
    }
}

class Employee extends Person {
    int empid;
    double salary;

    Employee(String n, String g, String a, int ag, int id, double s) {
        super(n, g, a, ag);
        empid = id; 
        salary = s;
    }
}

class Teacher extends Employee {
    int teacherId;
    String subject, department;

    Teacher(String n, String g, String a, int ag, int id, double s,
            int tid, String sub, String dep) {

        super(n, g, a, ag, id, s);
        teacherId = tid;
        subject = sub;
        department = dep;
    }

    void display() {
        System.out.println("\nTeacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class pgm8Person {
    public static void main(String[] args) {

        Teacher t1 = new Teacher(
            "Abi", "Male", "Kerala", 22,
            101, 40000,
            1, "Java", "CS"
        );

        Teacher t2 = new Teacher(
            "Anu", "Female", "Kochi", 30,
            102, 35000,
            2, "Maths", "Science"
        );

        t1.display();
        t2.display();
    }
}


