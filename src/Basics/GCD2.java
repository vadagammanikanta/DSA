package Basics;

import java.util.Scanner;

//Better Approach
public class GCD2 {
    public static int gcd(int a, int b){
        for(int i=Math.min(a,b);i>0;i--){
            if(a%i==0&&b%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(gcd(a,b));
    }
}
