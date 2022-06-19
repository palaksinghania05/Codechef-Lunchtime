package y2021.july;

import java.util.Scanner;

public class BeautifulPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T-->0){
                long N = sc.nextLong();
                long[] arr = new long[(int) N];
                for (int i = 0; i < N; i++) {
                    arr[i] =  sc.nextInt();
                }
                int count = 0;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        double left = (double) (arr[i]-arr[j])/arr[i];
                        double right = (double) (arr[i]-arr[j])/arr[j];
                       // System.out.println(left);
                      //  System.out.println(right);
                        if(left<right && i!=j)
                            count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
