package basicmath;

import java.util.*;

public class palindromeNum {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int dup = N;
            int revNum = 0;
            
            while (N > 0) {
                int ld = N % 10;
                N = N / 10;
                revNum = (revNum * 10) + ld;
            }
            boolean t;
            
            t = revNum==dup;
            System.out.println(t);

            s.close();
        }
    }
}
