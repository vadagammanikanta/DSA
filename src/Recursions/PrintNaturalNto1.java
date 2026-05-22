package Recursions;

import java.util.Scanner;

//Print N to 1 using Recursion
public class PrintNaturalNto1 {
    public void printNatural(int current){
        if(current<1){
            return;
        }
        System.out.print(current+" ");
        printNatural(current-1);
    }

    public static void main(String[] args) {
        PrintNaturalNto1 p = new PrintNaturalNto1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        p.printNatural(n);
    }
}
