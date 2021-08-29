/*
You are given a sequence of integers A1,A2,…,AN and an integer K. Find the number of contiguous subsequences
AL,AL+1,…,AR such that R−L+1≥K and the K-th element of the subsequence (AL+K−1)
is equal to the maximum of all elements of the entire sequence.
 */

package august;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class KthMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int K = sc.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                int count = 0;
                int maximum = arr[N-1];
                System.out.println(maximum);
                for (int i = K-1; i < N; i++) {
                    if(arr[i] == maximum)
                        count = count + (N-i);
                }
                System.out.println(count);
                T--;
            }
        }
    }
}
