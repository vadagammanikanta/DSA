package Patterns;

import java.util.Scanner;

//Inverted Right Pyramid
/*In this pattern, the number of stars decreases in each row. The first row has N stars, the second row has N-1, the third has N-2, and so on, until only one star remains in the last row. This creates an inverted right-angled triangle.

Run an outer loop (i) from 0 to N-1 for rows.
For each row, run an inner loop (j) starting from N down to i+1.
Print a star (*) in each iteration of the inner loop.
After finishing each row, print a newline to move to the next row.*/
public class Pattern5 {
    public void pattern5(int n){
        for(int i = 0; i < n; i++){
            for (int j=n; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern5 p = new Pattern5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p.pattern5(n);
    }
}
