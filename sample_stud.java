// Create a class Department with attributes departmentName and location.
// Create a class Course with attributes courseName and courseDuration.
// Create a class Student with attributes studentName and rank.
// The program must:
// Create a Department that offers a minimum of 2 courses.
// Each course must have a minimum of 5 students.
// Display the details of the department along with the courses and students.
// The students must be sorted with respect to rank before displaying.


import java.util.*;

// Student class
class Student implements Comparable<Student> {
    String studentName;
    int rank;

    Student(String studentName, int rank) {
        this.studentName = studentName;
        this.rank = rank;
    }

    // Sorting by rank
    public int compareTo(Student s) {
        return this.rank - s.rank;
    }
}

// Course class
class Course {
    String courseName;
    int courseDuration;
    Student[] students;

    Course(String courseName, int courseDuration, int size) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        students = new Student[size];
    }

    void addStudent(int index, Student s) {
        students[index] = s;
    }

    void sortStudents() {
        Arrays.sort(students);
    }

    void display() {
        sortStudents();
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + courseDuration + " months");
        System.out.println("Students (Sorted by Rank):");
        for (Student s : students) {
            System.out.println("Name: " + s.studentName + ", Rank: " + s.rank);
        }
        System.out.println("----------------------------------");
    }
}

// Department class
class Department {
    String departmentName;
    String location;
    Course[] courses;

    Department(String departmentName, String location, int size) {
        this.departmentName = departmentName;
        this.location = location;
        courses = new Course[size];
    }

    void addCourse(int index, Course c) {
        courses[index] = c;
    }

    void displayDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Location: " + location);
        System.out.println("----------------------------------");
        for (Course c : courses) {
            c.display();
        }
    }
}

// Main class
public class sample_stud {
    public static void main(String[] args) {

        Department dept = new Department("Information Technology", "Ernakulam", 2);

        Course c1 = new Course("BSc CS", 36, 5);
        c1.addStudent(0, new Student("Asha", 4));
        c1.addStudent(1, new Student("Rohit", 1));
        c1.addStudent(2, new Student("Neha", 3));
        c1.addStudent(3, new Student("Vivek", 2));
        c1.addStudent(4, new Student("Anita", 5));

        Course c2 = new Course("MSc CS", 24, 5);
        c2.addStudent(0, new Student("Karthik", 3));
        c2.addStudent(1, new Student("Divya", 1));
        c2.addStudent(2, new Student("Manu", 5));
        c2.addStudent(3, new Student("Sneha", 2));
        c2.addStudent(4, new Student("Rahul", 4));

        dept.addCourse(0, c1);
        dept.addCourse(1, c2);

        dept.displayDetails();
    }
}






// Department: Information Technology
// Location: Ernakulam
// ----------------------------------
// Course Name: BSc CS
// Duration: 36 months
// Students (Sorted by Rank):
// Name: Rohit, Rank: 1
// Name: Vivek, Rank: 2
// Name: Neha, Rank: 3
// Name: Asha, Rank: 4
// Name: Anita, Rank: 5
// ----------------------------------
// Course Name: MSc CS
// Duration: 24 months
// Students (Sorted by Rank):
// Name: Divya, Rank: 1
// Name: Sneha, Rank: 2
// Name: Karthik, Rank: 3
// Name: Rahul, Rank: 4
// Name: Manu, Rank: 5
