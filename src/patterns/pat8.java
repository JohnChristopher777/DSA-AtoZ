package patterns;
import static java.lang.Double.min;
import java.util.Scanner;

public class pat8 {
    public void hollowsquare(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public void intmatrix(int N) {
        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * N - 2) - j;
                int down = (2 * N - 2) - i;
                int num = (int) min(min(top, down), min(left, right));
                System.out.print(N - num);
            }
        System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        pat8 p = new pat8();
        //p.hollowsquare(N);
        p.intmatrix(N);
        sc.close();
    }
}
