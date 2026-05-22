package Basics;

import java.util.Scanner;

public class ReverseDigits {
    public static int reverse(int x){
        int rev=0;

        while(x!=0){

            rev=rev*10+x%10;
            x=x/10;

        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ReverseDigits obj=new ReverseDigits();
        System.out.println(obj.reverse(n));
    }
}
