// Create class Zoo with name and region (String array; sample data eg. Area-1, Area-2 etc).
// Create an inner class Enclosure with name (String; sample data eg. Grassland, Fly zone, Aquatic etc), type (String; sample data Outdoor, Indoor etc) and animals (String array with the list of animals found in the given enclosure).
// Create a static nested class Contact with address and phone no.
// Display details of zoo including its contact info and detailed information of different enclosures.

class Pg4_Zoo {

    String name;
    String[] region;

    // Static nested class
    static class Contact {
        String address;
        String phoneNo;

        void display() {
            System.out.println("Address : " + address);
            System.out.println("Phone No : " + phoneNo);
        }
    }

    // Inner class
    class Enclosure {
        String name;
        String type;
        String[] animals;

        void display() {
            System.out.println("Enclosure Name : " + name);
            System.out.println("Enclosure Type : " + type);
            System.out.print("Animals : ");
            for (String a : animals) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Pg4_Zoo zoo = new Pg4_Zoo();
        zoo.name = "City Zoo";
        zoo.region = new String[]{"Area-1", "Area-2"};

        System.out.println("Zoo Name : " + zoo.name);
        System.out.print("Regions : ");
        for (String r : zoo.region) {
            System.out.print(r + " ");
        }
        System.out.println();

        // Contact details
        Pg4_Zoo.Contact contact = new Pg4_Zoo.Contact();
        contact.address = "MG Road";
        contact.phoneNo = "9876543210";
        contact.display();

        // Enclosure 1
        Pg4_Zoo.Enclosure e1 = zoo.new Enclosure();
        e1.name = "Grassland";
        e1.type = "Outdoor";
        e1.animals = new String[]{"Lion", "Tiger", "Deer"};
        e1.display();

        // Enclosure 2
        Pg4_Zoo.Enclosure e2 = zoo.new Enclosure();
        e2.name = "Fly Zone";
        e2.type = "Indoor";
        e2.animals = new String[]{"Parrot", "Eagle"};
        e2.display();

        // Enclosure 3
        Pg4_Zoo.Enclosure e3 = zoo.new Enclosure();
        e3.name = "Aquatic";
        e3.type = "Indoor";
        e3.animals = new String[]{"Fish", "Turtle"};
        e3.display();
    }
}



// Zoo Name : City Zoo
// Regions : Area-1 Area-2
// Address : MG Road
// Phone No : 9876543210
// Enclosure Name : Grassland
// Enclosure Type : Outdoor
// Animals : Lion Tiger Deer
// Enclosure Name : Fly Zone
// Enclosure Type : Indoor
// Animals : Parrot Eagle
// Enclosure Name : Aquatic
// Enclosure Type : Indoor
// Animals : Fish Turtle
