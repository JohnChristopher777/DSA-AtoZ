package basicmath;

import java.util.*;


public class countdigits {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            
            int count = 0;
            
            //or another way is log base 10(N) +1
            
            int count2 = (int) (Math.log10(N) + 1);
            
            if (N < 0)
                count = -1;
            
            else if (N == 0)
                count = 0;
            else {
                while (N > 0) {
                    count++;
                    N = N / 10;
                }
            }
            
            
            System.out.println(count);
            System.out.println(count2);
        }
    }
}
