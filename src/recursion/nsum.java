package recursion;

import java.util.Scanner;

public class nsum {
    public void parameter(int i, int sum) {
        if (i < 1) {
            System.out.println(sum + " using parameterized recursion.");
            return;
        }
        parameter(i - 1, sum + i);
    }
    
    public int functional(int i) {
        if (i == 0) {
            return 0;
        }
        
        return i + functional(i-1);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        //brute force 
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum + " using brute-force.");

        //using formula 
        int sum1 = (n * (n + 1)) / 2;
        System.out.println(sum1 + " using formula.");

        //using parameterized recursion 
        nsum obj = new nsum();
        obj.parameter(n, 0);

        //using functional recursive 
        System.out.println(obj.functional(n)+ " using functional recursive.");

        s.close();
    }
}
