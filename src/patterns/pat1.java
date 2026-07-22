package patterns;
import java.util.Scanner; 
public class pat1 {   //pattern 1
    public void pattern1(int N) { //square pattern with asterisk

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            pat1 p = new pat1();
            int N = s.nextInt();
            p.pattern1(N);
        }
    }
    
}