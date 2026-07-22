package patterns;
import java.util.Scanner;

public class pat7 { //pattern 19 and 20
    public void hollowDiamond(int N) {
        int spaces = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces += 2;
        }
        int ispace = 2 * (N - 1);
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= ispace; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            ispace -= 2;
            System.out.println();

        }
    }
   
    public void Butterfly(int N) {
        int spaces = 2*N-2;
        for (int i = 1; i <= 2*N-1 ; i++) {
            //star
            int star = i;
            if (i > N) star= 2 * N - i;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
            //star    
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
             if (i < N)
                spaces -= 2;
            else
                spaces += 2;
             
        }
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        pat7 p = new pat7();
        //p.hollowDiamond(N);
        p.Butterfly(N);
        sc.close();
    }
}