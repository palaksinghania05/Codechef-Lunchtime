/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-08-2022
 */

package y2022.august;

import java.util.Scanner;

public class TestAverages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            double avg1 = (double)(A+B)/2;
            double avg2 = (double)(B+C)/2;
            double avg3 = (double)(A+C)/2;
            if (avg1>=35 && avg2>=35 && avg3>=35)
                System.out.println("Pass");
            else
                System.out.println("Fail");
            T--;
        }
    }
}
