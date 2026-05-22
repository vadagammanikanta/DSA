package Basics;

import java.util.Scanner;

public class Palindrome {
//    @org.jetbrains.annotations.NotNull
//    @org.jetbrains.annotations.Contract(pure = true)
    public static String isPalindrome(int n) {
        int temp = n;
        int rev = ReverseDigits.reverse(n);
//        while (n != 0) {
//            rev = rev * 10 + n % 10;
//            n = n / 10;
//        }
        return rev==temp?"Yes, it is a palindrome":"No, it is not a palindrome";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}
