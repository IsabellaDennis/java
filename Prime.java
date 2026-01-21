// Write a function that checks whether a given number is prime or not

import java.util.Scanner;

public class Prime {

    public int checkPrime(int n) {
        if (n <= 1)
            return 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int n = sc.nextInt();

        Prime obj = new Prime();
        int result = obj.checkPrime(n);

        if (result == 1)
            System.out.println("Prime number");
        else
            System.out.println("Not a Prime number");

        sc.close();
    }
}




// Enter value: 11
// Prime number
