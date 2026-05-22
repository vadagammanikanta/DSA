package Patterns;

import java.util.Scanner;

//Inverted Numbered Right Pyramid
/*This pattern looks similar to an inverted right-angled triangle, but instead of stars, we print numbers. Each row starts from 1 and continues up to N - i, where i is the current row index. Thus, the number of elements decreases with each row, creating an inverted triangle of numbers.

Run an outer loop (i) from 0 to N-1 for rows.
Inside it, run an inner loop (j) from N down to i+1.
Print numbers starting from 1 to N - i using the formula (N - j + 1).
After finishing each row, print a newline.*/
public class Pattern6 {
    public void pattern6(int n){
        for(int i = 0; i < n; i++){
            for (int j=n; j > i; j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern6 p = new Pattern6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p.pattern6(n);
    }
}
