package seminar_1;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int rez = 0;
        for (int i = 0; i <= n; i += 2) {
            rez += i;
        }
        System.out.println("Result = " + rez);
    }
}
