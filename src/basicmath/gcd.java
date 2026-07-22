package basicmath;

import java.util.Scanner;

public class gcd {
    //hcf

    public int optimize(int a, int b){
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            return b;

        return a;
    }
    public static void main(String[] args) {
         try (Scanner s = new Scanner(System.in)) {
            int n1 = s.nextInt();
             int n2 = s.nextInt();

             int gcd1 = 1;
             for (int i = 1; i <= Math.min(n1, n2); i++) { //or reverse the loop
                 if (n1 % i == 0 && n2% i == 0) { //break; once this condition is reached
                    gcd1 = i;                       
                }
             }
             System.out.println("The HCF of (" + n1 + "," + n2 + ") is " + gcd1);
             
             gcd obj = new gcd();
             System.out.println("The GCD of (" + n1 + "," + n2 + ") is " +obj.optimize(n1,n2));  //O(log∅ min(a,b))
         }
        }
}
