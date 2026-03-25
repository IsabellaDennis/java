// Create a class Product (productName, stockQuantity).
// Implement a method purchase(int quantity):
// If quantity <= 0 → throw IllegalArgumentException with message "Quantity must be positive".
// If quantity > stockQuantity → throw custom OutOfStockException.

import java.util.*;

class OutOfStockException extends Exception {
    OutOfStockException() {
        super("requested quantity exceeds limit");
    }
}

class Products {   // as you wanted
    String productName;
    int stockQuantity;

    Products(String productName, int stockQuantity) {
        this.productName = productName;
        this.stockQuantity = stockQuantity;
    }

    void purchase(int quantity) throws OutOfStockException {

        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be positive");

        if (quantity > stockQuantity)
            throw new OutOfStockException();

        stockQuantity -= quantity;
    }
}

public class Pg21_ProductException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product: ");
        String name = sc.next();

        System.out.print("Enter quantity: ");
        int stock = sc.nextInt();

        Products p = new Products(name, stock);

        try {
            System.out.print("Enter quantity to purchase: ");
            int q = sc.nextInt();

            p.purchase(q);

            System.out.println("Purchase successful");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
Output:

Enter product: phone
Enter quantity: 5
Enter quantity to purchase: 10
requested quantity exceeds limit
*/