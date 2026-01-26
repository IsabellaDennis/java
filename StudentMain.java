// Create a class 'Student' with data members Rollno, Name and Marks. Create N objects of the class and generate the ranklist.
// (a) Include all types of constructors
// (b) Display the total number of students
// (c) Compare 2 students by their marks


import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks;
    static int count = 0;

    // Default constructor
    Student() {
        rollNo = 0;
        name = "NA";
        marks = 0;
        count++;
    }

    // Parameterized constructor
    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
        count++;
    }

    // Copy constructor using 'other'
    Student(Student other) {
        rollNo = other.rollNo;
        name = other.name;
        marks = other.marks;
        count++;
    }

    void display() {
        System.out.println(rollNo + "  " + name + "  " + marks);
    }

    // Compare two students by marks
    static void compare(Student s1, Student s2) {
        if (s1.marks > s2.marks)
            System.out.println(s1.name + " has higher marks");
        else
            System.out.println(s2.name + " has higher marks");
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter RollNo Name Marks: ");
            int r = sc.nextInt();
            String name = sc.next();
            int m = sc.nextInt();

            s[i] = new Student(r, name, m);
        }

        // Simple rank list logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].marks < s[j].marks) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        // Display
        System.out.println("\nRank List");
        System.out.println("RollNo Name Marks");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        System.out.println("\nTotal Students: " + Student.count);

        if (n >= 2) {
            System.out.println("\nComparison:");
            Student.compare(s[0], s[1]);
        }

        sc.close();
    }
}

