/*
Question:
Create a list of names. Write a menu driven Java program to perform the following operations:
1. Add names
2. Remove names
3. Search for a name
4. Sort names
5. Display names
6. Exit
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pg16_NameManager {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n1. Add Name");
            System.out.println("2. Remove Name");
            System.out.println("3. Search Name");
            System.out.println("4. Sort Names");
            System.out.println("5. Display Names");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name to add: ");
                    String nameToAdd = sc.nextLine();
                    names.add(nameToAdd);
                    System.out.println("Name added successfully");
                    break;

                case 2:
                    System.out.print("Enter name to remove: ");
                    String nameToRemove = sc.nextLine();

                    if (names.remove(nameToRemove)) {
                        System.out.println("Name removed successfully");
                    } else {
                        System.out.println("Name not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String nameToSearch = sc.nextLine();

                    if (names.contains(nameToSearch)) {
                        System.out.println("Name found in the list");
                    } else {
                        System.out.println("Name not found");
                    }
                    break;

                case 4:
                    Collections.sort(names);
                    System.out.println("Names sorted successfully");
                    break;

                case 5:
                    if (names.isEmpty()) {
                        System.out.println("List is empty");
                    } else {
                        System.out.println("List of names:");
                        for (String name : names) {
                            System.out.println(name);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");

            }

        } while (choice != 6);

        sc.close();
    }
}

/*
Sample Output:

1. Add Name
2. Remove Name
3. Search Name
4. Sort Names
5. Display Names
6. Exit
Enter your choice: 1
Enter name to add: Rahul
Name added successfully

Enter your choice: 1
Enter name to add: Anu
Name added successfully

Enter your choice: 5
List of names:
Rahul
Anu

Enter your choice: 3
Enter name to search: Rahul
Name found in the list

Enter your choice: 4
Names sorted successfully

Enter your choice: 5
List of names:
Anu
Rahul

Enter your choice: 6
Exit
*/