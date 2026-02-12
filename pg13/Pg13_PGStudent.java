// Create class Person (name, gender, phoneno).
// Create an interface Showable with void show().
// Derive class Student (course, score) from Person.
// Derive class PGStudent (researchArea, guide) from Student.
// Create N PGStudents, and
// (i) rank them based on score
// (ii) sort them based on researchArea
// Display the student details using show().



package pg13;
import java.util.*;

// Interface
interface Showable {
    void show();
}

// Base class
class Person {
    String name, gender, phoneNo;

    Person(String name, String gender, String phoneNo) {
        this.name = name;
        this.gender = gender;
        this.phoneNo = phoneNo;
    }
}

// Student class
class Student extends Person {
    String course;
    double score;

    Student(String name, String gender, String phoneNo,
            String course, double score) {
        super(name, gender, phoneNo);
        this.course = course;
        this.score = score;
    }
}

// PGStudent class
class PGStudent extends Student implements Showable {
    String researchArea, guide;

    PGStudent(String name, String gender, String phoneNo,
              String course, double score,
              String researchArea, String guide) {
        super(name, gender, phoneNo, course, score);
        this.researchArea = researchArea;
        this.guide = guide;
    }

    public void show() {
        System.out.println(name + " | " + course + " | Score: " + score +
                " | Research: " + researchArea + " | Guide: " + guide);
    }
}

// Main class
public class Pg13_PGStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of PG Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        PGStudent[] students = new PGStudent[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Course: ");
            String course = sc.nextLine();

            System.out.print("Score: ");
            double score = sc.nextDouble();
            sc.nextLine();

            System.out.print("Research Area: ");
            String research = sc.nextLine();

            System.out.print("Guide: ");
            String guide = sc.nextLine();

            students[i] = new PGStudent(name, gender, phone,
                    course, score, research, guide);
        }

        // (i) Rank based on score (Descending)
        Arrays.sort(students, (a, b) -> Double.compare(b.score, a.score));

        System.out.println("\n--- Ranking based on Score ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Rank " + (i + 1) + ": ");
            students[i].show();
        }

        // (ii) Sort based on researchArea
        Arrays.sort(students, Comparator.comparing(s -> s.researchArea));

        System.out.println("\n--- Sorted based on Research Area ---");
        for (PGStudent s : students) {
            s.show();
        }

        sc.close();
    }
}


// Enter number of PG Students: 2

// Student 1
// Name: Anu
// Gender: Female
// Phone: 9876543210
// Course: MCA
// Score: 85
// Research Area: AI
// Guide: Dr. Ravi

// Student 2
// Name: Arun
// Gender: Male
// Phone: 9123456780
// Course: MSc
// Score: 92
// Research Area: Data Science
// Guide: Dr. Meera


// --- Ranking based on Score ---
// Rank 1: Arun | MSc | Score: 92.0 | Research: Data Science | Guide: Dr. Meera
// Rank 2: Anu | MCA | Score: 85.0 | Research: AI | Guide: Dr. Ravi


// --- Sorted based on Research Area ---
// Anu | MCA | Score: 85.0 | Research: AI | Guide: Dr. Ravi
// Arun | MSc | Score: 92.0 | Research: Data Science | Guide: Dr. Meera
