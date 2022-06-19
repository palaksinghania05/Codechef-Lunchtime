package y2021.september;

import java.util.Scanner;

public class VaccineDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int D = sc.nextInt();
                int L = sc.nextInt();
                int R = sc.nextInt();
                if(D<L)
                    System.out.println("Too Early");
                else if(D>R)
                    System.out.println("Too Late");
                else
                    System.out.println("Take second dose now");
                T--;
            }
        }
    }
}
