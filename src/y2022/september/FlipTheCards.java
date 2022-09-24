/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-09-2022
 */

package y2022.september;

import java.util.Scanner;

public class FlipTheCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            if(N-X < X)
                System.out.println(N-X);
            else
                System.out.println(X);
            T--;
        }
    }
}
