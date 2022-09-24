/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-09-2022
 */

package y2022.september;

import java.util.Scanner;

public class SleepDeprivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            if(X<7)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
