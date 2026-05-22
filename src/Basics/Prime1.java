package Basics;

import java.util.Scanner;

//Brute Force Approach
public class Prime1 {
    public String isPrime(int num) {
        int cnt=0;
        for (int i=1;i<=num;i++)
            {
            if(num%i==0)
            {
                cnt++;
            }
            }
        return cnt==2?"Prime":"Not Prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prime1 p = new Prime1();
        int num = sc.nextInt();
        System.out.println(p.isPrime(num));
    }
}
