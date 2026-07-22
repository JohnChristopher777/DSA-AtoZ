package basicmath;

import java.util.*;

public class primeNum {

    
    public void optimize(int N) {

        int count = 0;
        //O(sqrt(N))
        for (int i = 1; i * i <= N; i++) { //instead of calling i <= (int)Math.sqrt(N) function each time 
            if (N % i == 0) {
                count++;
                if (N / i != i) {
                    count++;
                }
            }

        }
        if (count == 2)
                System.out.println("prime");
            else
                System.out.println("Not prime");
       
    }
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();

            int count = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.println("prime");
            else
                System.out.println("Not prime");
            s.close();

            primeNum obj = new primeNum();
            obj.optimize(N); //O(sqrt(N))
        }
       
    }
}