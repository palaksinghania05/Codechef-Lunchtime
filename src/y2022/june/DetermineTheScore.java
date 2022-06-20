/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-06-2022
 */

package y2022.june;

import java.util.Scanner;

public class DetermineTheScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int N = sc.nextInt();
            int pointsPerProblem = X/10;
            int score = N*pointsPerProblem;
            System.out.println(score);
            T--;
        }
    }
}
