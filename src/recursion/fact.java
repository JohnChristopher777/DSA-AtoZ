package recursion;

import java.util.Scanner;

public class fact {

    public int soln(int i){
        if (i == 0) {
            return 1;
        }

        return i * soln(i - 1);
    }

    public static void main(String[] args) {
         try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            
             //iterative
             int fac = 1;
             for (int i = 1; i <= N; i++) {
                 fac = fac * i;
             }
             System.out.println("Factorial of " + N + " is " + fac + " using brute force");

             fact obj = new fact();
             System.out.println("Factorial of " + N + " is " + obj.soln(N));
         }

    }
}
