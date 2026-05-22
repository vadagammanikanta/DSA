package Patterns;

import java.util.Scanner;

//Right-Angled Triangle Pattern
/*This is one of the simplest star patterns. We need to form a right-angled triangle where the number of stars in each row increases line by line. Row i contains exactly i + 1 stars.

Run an outer loop from 0 to N-1 to handle rows.
For each row i, run an inner loop from 0 to i.
In the inner loop, print a star (*).
After finishing the stars of one row, move to the next line using endl.*/
public class Pattern2 {
    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern2 p = new Pattern2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p.pattern2(n);
    }
}
