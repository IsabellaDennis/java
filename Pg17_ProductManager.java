/*
Question:
Create a class Product(name, price). Write a menu driven program to
(a) Add products
(b) Sort product by name
(c) Display products
*/

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Pg17_ProductManager {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Product");
            System.out.println("2. Sort Products by Name");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    products.add(new Product(name, price));
                    System.out.println("Product added successfully");
                    break;

                case 2:
                    Collections.sort(products, Comparator.comparing(p -> p.name));
                    System.out.println("Products sorted by name");
                    break;

                case 3:
                    for (Product p : products) {
                        System.out.println(p.name + " - " + p.price);
                    }
                    break;

                case 4:
                    System.out.println("Exit");
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}

/*
Sample Output:

1. Add Product
2. Sort Products by Name
3. Display Products
4. Exit
Enter choice: 1
Enter product name: Laptop
Enter price: 50000
Product added successfully

Enter choice: 1
Enter product name: Mouse
Enter price: 500
Product added successfully

Enter choice: 2
Products sorted by name

Enter choice: 3
Laptop - 50000.0
Mouse - 500.0
*/