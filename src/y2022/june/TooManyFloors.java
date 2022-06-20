/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-06-2022
 */

package y2022.june;

import java.util.Scanner;

public class TooManyFloors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int result = Math.abs(findFloor(X) - findFloor(Y));
            System.out.println(result);
            T--;
        }
    }

    public static int findFloor(int room){
        if(room<=10)
            return 1;
        else if(room<=20)
            return 2;
        else if(room<=30)
            return 3;
        else if(room<=40)
            return 4;
        else if(room<=50)
            return 5;
        else if(room<=60)
            return 6;
        else if(room<=70)
            return 7;
        else if(room<=80)
            return 8;
        else if(room<=90)
            return 9;
        else
            return 10;
    }
}
