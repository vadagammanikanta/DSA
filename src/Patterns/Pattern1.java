package Patterns;

import java.util.Scanner;

//Rectangular Star Pattern
/*Intuition: The task is to print a square pattern of stars. Since the number of rows and columns are equal, we can use two nested loops: the outer one for rows and the inner one for printing N stars per row.

Take an integer N as input to define the size of the square.
Use a loop from 0 to N-1 to represent each row.
Inside that loop, use another loop from 0 to N-1 to print stars in the current row.
Print "* " during each inner loop iteration to form the row.
After each inner loop completes, move to the next line.*/
public class Pattern1 {
    public void pattern1(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1 p = new Pattern1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p.pattern1(n);
    }
}
