/*
Currently, Chef has to use a language with two given features A and B.
He has two options --- switching to a language with two features A1 and B1, or to a language with two
features A2 and B2. All four features of these two languages are pairwise distinct.
Tell Chef whether he can use the first language, the second language or neither of these languages
(if no single language has all the required features).
 */

package august;

import java.util.Scanner;

public class ProgrammingLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T =sc.nextInt();
            while(T>0){
                int A = sc.nextInt();
                int B = sc.nextInt();
                int A1 = sc.nextInt();
                int B1 = sc.nextInt();
                int A2 = sc.nextInt();
                int B2 = sc.nextInt();
                if((A==A1 || A==B1) && (B==A1 || B==B1))
                    System.out.println(1);
                else if((A==A2 || A==B2) && (B==A2 || B==B2))
                    System.out.println(2);
                else
                    System.out.println(0);
                T--;
            }
        }
    }
}
