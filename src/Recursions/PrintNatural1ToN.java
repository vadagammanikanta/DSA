package Recursions;

import java.util.Scanner;

//Print 1 to N using Recursion
/*Forward Recursion
Algorithm
To print numbers from 1 to n using forward recursion, the approach involves defining a recursive function that takes the current number as a parameter. The function first checks if the current number exceeds n; if it does, the recursion terminates. Otherwise, it prints the current number and then recursively calls itself with the next number incremented by one. This way, the numbers are printed in ascending order as the recursion unfolds forward from the base case to the maximum number. The key is to make the print statement before the recursive call, ensuring the numbers appear from 1 up to n in order.*/
public class PrintNatural1ToN {
    static int current=1;
    public void printNatural(int current,int n){
        if(current>n)
            {
            return;

            }
        System.out.print(current+" ");
        printNatural(current+1,n);
    }

    public static void main(String[] args) {
        PrintNatural1ToN p = new PrintNatural1ToN();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p.printNatural(current,n);

    }
}
