package Basics;

import java.util.Scanner;

public class Armstrong {
    public static String isArmstrong(int num)
    {
        int k=CountDigitsPro.countDigits(num);
        int sum=0;
        int temp=num;
        while(temp>0)
        {
            int lastDigit=temp%10;
            sum+=Math.pow(lastDigit,k);
            temp=temp/10;
        }
        return sum==num?"Armstrong":"Not Armstrong";
    }

    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println(isArmstrong(num));
    }
}
