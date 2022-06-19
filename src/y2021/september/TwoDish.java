package y2021.september;

import java.util.Scanner;

public class TwoDish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                int count = 0;
                count = count + Math.min(A,B);
                B = B - Math.min(A,B);
                if(B <= 0){
                    if(count >= N)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else{
                    count = count + Math.min(B,C);
                    if(count >= N)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                T--;
            }
        }
    }
}
