package patterns;
import java.util.Scanner; 
public class pat2 { //pattern 2 to 7
    public void RAT(int N) {

        for (int i = 1; i <= N; i++) { //right angled triangle patterns
            for (int j = 1; j <= i; j++) {
                // System.out.print("* ");
                //System.out.print(j + " ");
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void IRAT(int N) {   //inverted right angled triangle patterns
        for (int i = N ; i >= 1; i--) {  //could be for(int i = 0; i<=N; i++)
            for (int j = i ; j >= 1; j--) {  //could be for(int j = 0; j <=N-i; j++)
                //System.out.print("* " );
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pat2 p = new pat2();
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            //p.RAT(N);
            p.IRAT(N);
        }
    }           
}