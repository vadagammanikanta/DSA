package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Brute Force Approach
public class Divisors1 {
    public static List<Integer> divisors(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Divisors1 d = new Divisors1();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(d.divisors(num));
    }
}
