package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Optimal Approach
public class Divisors2 {
    public List<Integer> divisors(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i *i<= num; i++) {
            if (num % i == 0) {
                list.add(i);
                if(i!=num/i){
                    list.add(num/i);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Divisors2 d = new Divisors2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(d.divisors(num));
    }
}
