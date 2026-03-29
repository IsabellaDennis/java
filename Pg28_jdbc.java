import java.sql.*;
import java.util.Scanner;

public class Pg28_jdbc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // ✅ Oracle Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // ✅ Your preferred connection format
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system",
                "manager"
            );

            Statement stmt = con.createStatement();

            // ✅ Create table inside Java
            try {
                stmt.executeUpdate(
                    "CREATE TABLE Book (" +
                    "BookId NUMBER PRIMARY KEY, " +
                    "Title VARCHAR2(50), " +
                    "Author VARCHAR2(50), " +
                    "Price NUMBER)"
                );
                System.out.println("Table created successfully!");
            } catch (Exception e) {
                System.out.println("Table already exists");
            }

            int choice;

            do {
                System.out.println("\n1.Insert Book");
                System.out.println("2.Display All Books");
                System.out.println("3.Search by Title");
                System.out.println("4.Search by Author");
                System.out.println("5.Update Price");
                System.out.println("6.Delete Book");
                System.out.println("7.Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    // 1️⃣ Insert
                    case 1:
                        System.out.print("Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Title: ");
                        String title = sc.nextLine();

                        System.out.print("Author: ");
                        String author = sc.nextLine();

                        System.out.print("Price: ");
                        double price = sc.nextDouble();

                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO Book VALUES(?,?,?,?)");

                        ps1.setInt(1, id);
                        ps1.setString(2, title);
                        ps1.setString(3, author);
                        ps1.setDouble(4, price);

                        ps1.executeUpdate();
                        System.out.println("Book inserted!");
                        break;

                    // 2️⃣ Display All
                    case 2:
                        ResultSet rs = stmt.executeQuery("SELECT * FROM Book");

                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getString(3) + " " +
                                    rs.getDouble(4));
                        }
                        break;

                    // 3️⃣ Search by Title
                    case 3:
                        System.out.print("Enter title: ");
                        String t = sc.nextLine();

                        PreparedStatement ps2 = con.prepareStatement(
                                "SELECT * FROM Book WHERE Title=?");
                        ps2.setString(1, t);

                        ResultSet rs2 = ps2.executeQuery();

                        while (rs2.next()) {
                            System.out.println(rs2.getInt(1) + " " +
                                    rs2.getString(2) + " " +
                                    rs2.getString(3) + " " +
                                    rs2.getDouble(4));
                        }
                        break;

                    // 4️⃣ Search by Author
                    case 4:
                        System.out.print("Enter author: ");
                        String a = sc.nextLine();

                        PreparedStatement ps3 = con.prepareStatement(
                                "SELECT * FROM Book WHERE Author=?");
                        ps3.setString(1, a);

                        ResultSet rs3 = ps3.executeQuery();

                        while (rs3.next()) {
                            System.out.println(rs3.getInt(1) + " " +
                                    rs3.getString(2) + " " +
                                    rs3.getString(3) + " " +
                                    rs3.getDouble(4));
                        }
                        break;

                    // 5️⃣ Update Price
                    case 5:
                        System.out.print("Enter Book ID: ");
                        int bid = sc.nextInt();

                        System.out.print("New Price: ");
                        double newPrice = sc.nextDouble();

                        PreparedStatement ps4 = con.prepareStatement(
                                "UPDATE Book SET Price=? WHERE BookId=?");

                        ps4.setDouble(1, newPrice);
                        ps4.setInt(2, bid);

                        ps4.executeUpdate();
                        System.out.println("Price updated!");
                        break;

                    // 6️⃣ Delete Book
                    case 6:
                        System.out.print("Enter Book ID: ");
                        int delId = sc.nextInt();

                        PreparedStatement ps5 = con.prepareStatement(
                                "DELETE FROM Book WHERE BookId=?");

                        ps5.setInt(1, delId);

                        ps5.executeUpdate();
                        System.out.println("Book deleted!");
                        break;
                }

            } while (choice != 7);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
