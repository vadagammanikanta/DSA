package Patterns;

import java.util.Scanner;

//Right-Angled Number Pyramid
/*TWe need to print a right-angled triangle where each row contains numbers starting from 1 up to the row number. So, the first row has 1, the second row has 1 2, the third row has 1 2 3, and so on until N.

Use an outer loop (i) from 1 to N for rows.
For each row, use an inner loop (j) from 1 to i to print numbers.
Each row prints numbers starting from 1 up to the current row index.
After printing each row, move to the next line.*/
public class Pattern3 {
    public void pattern3(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern3 p = new Pattern3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p.pattern3(n);
    }
}
