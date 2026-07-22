package patterns;
import java.util.Scanner;

public class pat5 { //pattern 12,13 and 14
    
    public void RAT(int N) { //right angled triangle with alternating 1s and 0s
        int star;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0)
                star = 0;
            else
                star = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(star);
                star = 1 - star;
            }
            System.out.println();
        }
    }
    
    public void Toblerone(int N) { //Toblerone or Number Crown Pattern or Number Bridge Pattern 
        int space = 2 * (N - 1);
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            space -= 2;
            System.out.println();

        }
    }
       public void NRAT(int N) { //right angled triangle with increasing numbers from 1 to N*(N+1)/2
        int num = 1;
        for (int i = 1; i <= N; i++) {   
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
        pat5 p = new pat5();
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        //p.RAT(N);
        //p.Toblerone(N);
        p.NRAT(N);
        s.close();
    }   
}
