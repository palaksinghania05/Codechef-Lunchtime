/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-07-2022
 */

package y2022.july;

import java.util.Scanner;

public class TrueAndFalsePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(N-K);
            T--;
        }
    }
}
