package patterns;

import java.util.Scanner;

public class pat4 { //pattern 11
    public void pattern(int N) { //london bridge shape pattern
        for (int i = 0; i <= 2*N ; i++) {
            int stars = i;
            if (i > N)
                stars = 2 * N - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pat4 p = new pat4();
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        p.pattern(N);
        s.close();
    }
}