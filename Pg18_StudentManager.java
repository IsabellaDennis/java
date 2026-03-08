/*
Question:
Design a system to store student information, where each student has a
unique ID (integer) and a name (string). Use appropriate Java collection
to efficiently store and retrieve student names based on their ID.
*/

import java.util.*;

public class Pg18_StudentManager {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int id;
        String name;

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Student ID: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            name = sc.nextLine();

            students.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();

        if (students.containsKey(searchId)) {
            System.out.println("Student Name: " + students.get(searchId));
        } else {
            System.out.println("Student not found");
        }

        sc.close();
    }
}

/*
Sample Output:

Enter number of students: 2
Enter Student ID: 101
Enter Student Name: Rahul
Enter Student ID: 102
Enter Student Name: Anu

Enter ID to search: 101
Student Name: Rahul
*/