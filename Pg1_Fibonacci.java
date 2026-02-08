// Write a function to find the nᵗʰ Fibonacci number.
// Static Method

import java.util.Scanner;

public class Pg1_Fibonacci {

    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int n = sc.nextInt();

        int result = fib(n);
        System.out.println("Fibonacci = " + result);

        sc.close();
    }
}




// Enter value: 7
// Fibonacci = 13
