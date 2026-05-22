package Basics;

import java.util.Scanner;

//Euclidean Algorithm
//Optimal Approach
public class GCD3 {
    public static int gcd(int a, int b){
        while(a > 0 && b > 0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }

        }
        if(a == 0){
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(gcd(a,b));
    }
}
