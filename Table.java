// Write a function that generates the multiplication table
//Non Static Method

import java.util.Scanner;

public class Table {

    public int table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int n = sc.nextInt();

        Table obj = new Table();
        obj.table(n);

        sc.close();
    }
}




// Enter value: 3
// 3 x 1 = 3
// 3 x 2 = 6
// 3 x 3 = 9
// 3 x 4 = 12
// 3 x 5 = 15
// 3 x 6 = 18
// 3 x 7 = 21
// 3 x 8 = 24
// 3 x 9 = 27
// 3 x 10 = 30
