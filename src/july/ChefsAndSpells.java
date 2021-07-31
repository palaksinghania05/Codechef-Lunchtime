/*
Chef has three spells. Their powers are A, B, and C respectively.
Initially, Chef has 0 hit points, and if he uses a spell with power P, then his number of hit points
increases by P. Before going to sleep, Chef wants to use exactly two spells out of these three.
Find the maximum number of hit points Chef can have after using the spells.
 */

package july;

import java.util.Scanner;

public class ChefsAndSpells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T-->0){
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                int option1 = A+B;
                int option2 = B+C;
                int option3 = A+C;
                int result = Math.max(Math.max(option1,option2),option3);
                System.out.println(result);
            }
        }
    }
}
