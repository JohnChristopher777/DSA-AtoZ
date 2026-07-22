package basicmath;

import java.util.*;

public class revNum {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int revNum = 0;
            
            while (N > 0) {
                int ld = N % 10;
                N = N / 10;
                revNum = (revNum * 10) + ld;
            }
            System.out.println(revNum);
        }
    }
}
