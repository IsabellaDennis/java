// Find the average of N positive integers, raising a user defined exception for each negative input.

import java.util.*;

class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

public class Pg20_AverageWithException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, sum = 0, count = 0;

        System.out.print("Enter number of inputs: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            try {
                System.out.print("Enter number " + i + ": ");
                int num = sc.nextInt();

                if (num < 0)
                    throw new NegativeNumberException("Negative number not allowed");

                sum += num;
                count++;

            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        if (count > 0)
            System.out.println("Average = " + (sum / count));
    }
}

/*
Sample Output:

Enter number of inputs: 3
Enter number 1: 10
Enter number 2: -5
Negative number not allowed
Enter number 3: 20
Average = 15
*/