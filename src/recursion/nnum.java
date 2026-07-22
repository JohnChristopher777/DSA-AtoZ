package recursion;
import java.util.*;

public class nnum{
    public void forward(int i, int n) {
        if (i> n) {
            return;
        }
        System.out.print(i+ " ");

        forward(i+ 1, n);
    }
    
    public void backtrack(int i, int n) {
        if (i < 1) {
            return;
        }
        backtrack(i - 1, n);

        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = s.nextInt();
        
        nnum obj = new nnum();
        
        System.out.println("Using forward recursion:");
        obj.forward(1, n);
        
        System.out.println(" ");

        System.out.println("Using backtracking:");
        obj.backtrack(n, n);
        s.close();
    }
}
