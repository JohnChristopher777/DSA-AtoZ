package recursion;

import java.util.Scanner;

public class revnnum {
    public void forward(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        forward(i - 1, n);
    }

    public void backtrack(int i, int n) {
        if(i>n){
            return;
        }
        backtrack(i+1,n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.print("Enter n: ");
         int n = s.nextInt();
         revnnum obj = new revnnum();

         System.out.println("Using Forward Recursion:");
         obj.forward(n, n);
         System.out.println();

         System.out.println("Using backtracking:");
         obj.backtrack(1,n);

         s.close();
    }
}
