package recursion;

import java.util.Scanner;

public class nfibonacci {
    public int optimized(int i) {
        if (i <= 1)
            return i;
        
        int last = optimized(i - 1);
        int seclast = optimized(i - 2);

        return last + seclast;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            
            nfibonacci o = new nfibonacci();
            System.out.println(o.optimized(n) + " is the "+ n +"th fibonacci term" );
        }
    }
}
