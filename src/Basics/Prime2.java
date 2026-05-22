package Basics;
//Optimal Approach
import java.util.Scanner;

public class Prime2 {
    public String isPrime(int num) {
        int cnt = 0;
        for(int i=1;i<=Math.sqrt(num);i++)
            {
            if(num%i==0)
            {
                cnt++;
                if (num/i!=i)
                {
                    cnt++;
                }
            }
            }
        return cnt==2?"Prime":"Not Prime";
    }

    public static void main(String[] args) {
        Prime2 p = new Prime2();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(p.isPrime(num));

    }
}
