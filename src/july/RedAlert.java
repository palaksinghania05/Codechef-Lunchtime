/*
Finally a monsoon has come. According to the Meteorological Department, there will be rain in the upcoming
N days in the city. Initially, the water level of the city is zero millimetres.
The amount of rain on the i-th day can be described by an integer Ai as follows:
- If Ai>0, the water level of the city increases by Ai millimetres on the i-th day.
- If Ai=0, there is no rain on the i-th day. The water level of the city decreases by D millimetres
on such a day. However, if the water level is less than D millimetres before the i-th day, then it becomes
zero instead.
There will be a red alert in the city if the water level becomes strictly greater than H millimetres on at least one of the N days. Determine if there will be a red alert.
 */
package july;

import java.util.Scanner;

public class RedAlert {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int T = sc.nextInt();
                while (T-- > 0) {
                    int N = sc.nextInt();
                    int D = sc.nextInt();
                    int H = sc.nextInt();
                    int[] arr = new int[N];
                    String result = "NO";
                    int water = 0;
                    for (int i = 0; i < N; i++) {
                        arr[i] = sc.nextInt();
                    }
                    for(int i = 0; i<arr.length; i++){
                        if (arr[i] == 0)
                            water = Math.max(water - D, 0);
                        else
                            water = water + arr[i];
                        if (water > H) {
                            result = "YES";
                            break;
                        }
                    }
                    System.out.println(result);
                }
            }
        }catch(Exception e){
            return;
        }
    }
}
