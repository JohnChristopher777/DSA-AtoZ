package basicmath;

import java.util.Scanner;

public class armstrongNum {
        public static void main(String[] args) {
            try (Scanner s = new Scanner(System.in)) {
                int N = s.nextInt();
                int dup = N;
                int sum = 0;
                
                int digits = String.valueOf(N).length();
                
                while (N > 0) {
                    int ld = N % 10;
                    N = N / 10;
                    sum =sum+(int) Math.pow(ld, digits);
                }
                if (sum == dup)
                    System.out.println( dup + " is an Armstrong Number ");
                else
                    System.out.println(dup + " is not an Armstrong Number ");
               
                s.close();
            }
    }
}
