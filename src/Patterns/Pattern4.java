package Patterns;

import java.util.Scanner;

//Right-Angled Number Pyramid - II
/*In this pattern, instead of printing increasing numbers from 1 to i in each row, we print the row number itself repeatedly. For example, the first row prints 1, the second row prints 2 2, the third row prints 3 3 3, and so on until N.

Use an outer loop (i) from 1 to N for rows.
For each row, use an inner loop (j) from 1 to i.
Instead of printing j, print i (the current row number).
After completing one row, move to the next line.*/
public class Pattern4 {
    public void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern4 p = new Pattern4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p.pattern4(n);
    }
}
