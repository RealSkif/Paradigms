package seminar_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        long factorial = factorialRecursion(n);
        System.out.println("Factorial of n is " + factorial);
    }

    public static long factorialRecursion(int n) {
        if (n >= 1) return n * factorialRecursion(n - 1);
        else return 1;
    }
}
