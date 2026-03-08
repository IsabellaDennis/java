/*
Question:
Store a list of attendees, where each attendee is represented by an
Attendee class with name, email, and registrationId (a unique integer).
Ensure that each attendee is registered only once (no duplicate
registrationId).
*/

import java.util.*;

class Attendee {

    String name;
    String email;
    int registrationId;

    Attendee(String name, String email, int registrationId) {
        this.name = name;
        this.email = email;
        this.registrationId = registrationId;
    }
}

public class Pg19_EventManager {

    public static void main(String[] args) {

        HashMap<Integer, Attendee> attendees = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of attendees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Registration ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (attendees.containsKey(id)) {
                System.out.println("Duplicate Registration ID! Not allowed.");
                i--;
                continue;
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            attendees.put(id, new Attendee(name, email, id));
        }

        System.out.println("\nRegistered Attendees:");

        for (Attendee a : attendees.values()) {
            System.out.println(a.registrationId + " - " + a.name + " - " + a.email);
        }

        sc.close();
    }
}

/*
Sample Output:

Enter number of attendees: 2

Enter Registration ID: 1
Enter Name: Rahul
Enter Email: rahul@gmail.com

Enter Registration ID: 2
Enter Name: Anu
Enter Email: anu@gmail.com

Registered Attendees:
1 - Rahul - rahul@gmail.com
2 - Anu - anu@gmail.com
*/
