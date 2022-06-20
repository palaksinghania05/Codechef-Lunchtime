/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-06-2022
 */

package y2022.june;

import java.util.Scanner;

public class ItIsMyServe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int P = sc.nextInt();
            int Q = sc.nextInt();
            if((P+Q)%4 == 0 || (P+Q)%4 == 1)
                System.out.println("Alice");
            else
                System.out.println("Bob");
            T--;
        }
    }
}
