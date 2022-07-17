/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-07-2022
 */

package y2022.july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EasyPronunciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            String s = sc.next();
            int count = 0;
            ArrayList<Character> vowel = new ArrayList<>();
            vowel.add('a');
            vowel.add('e');
            vowel.add('i');
            vowel.add('o');
            vowel.add('u');
            for (int i = 0; i < N && count < 4; i++) {
                if(vowel.contains(s.charAt(i)))
                    count=0;
                else
                    count++;
            }
           // System.out.println(count);
            if(count<4)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
