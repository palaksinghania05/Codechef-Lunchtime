/*
You are given an integer N. Consider the sequence containing the integers 1,2,…,N in increasing order (each exactly once).
Find the maximum length of its contiguous subsequence with an even sum.
 */

package august;

import java.util.Scanner;

public class MaximumLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
               /* int sum = 0;
                int length = 0;
                for (int i = 1; i <= N; i++) {
                    sum = sum + i;
                }
                if(sum % 2 == 0)
                    System.out.println(N);
                else {
                    for (int i = 1; i <= N; i++) {
                        if (i % 2 == 1)
                            length = Math.max(length, Math.max(N-i-1, i-1));
                    }
                    System.out.println(length);
                }*/
                if(N%4==0 || (N+1)%4==0)
                    System.out.println(N);
                else
                    System.out.println(N-1);
                T--;
            }
        }
    }
}
