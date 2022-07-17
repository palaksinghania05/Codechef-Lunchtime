/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-07-2022
 */

package y2022.july;

import java.util.Scanner;

public class TheLastLevels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int result = X*Y + (X/3)*Z;
            if(X%3==0)
                result = result-Z;
            System.out.println(result);
            T--;
        }
    }
}
