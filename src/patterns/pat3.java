package patterns;

import java.util.Scanner;

public class pat3 { //pattern 8,9 and 10
    public void pattern(int N) {  //equilateral triangle pattern
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
      public void ipattern(int N) { //inverted equilateral triangle pattern
        for (int i = N; i >= 1; i--) {   //for(int i = 0; i < N; i++)
            for (int j = N - i; j >= 1; j--) {   //for(int j = 0; j < i; j++)
                System.out.print(" ");    
            }
            for (int j = 2 * i - 1; j >= 1; j--) { //can also be for(int j = 0; j < 2 * N - (2 * i + 1); j++)
                System.out.print("*");
            }
            for (int j = N - i; j >= 1; j--) { //for(int j = 0; j < i; j++)
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        pat3 p = new pat3();
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        p.pattern(N);  //for a full diamond like pattern print both 
        p.ipattern(N);
        s.close();
    }
}