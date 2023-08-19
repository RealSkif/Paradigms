package seminar_2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(fibonacci(n));
    }
    public static long fibonacci(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
