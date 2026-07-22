package recursion;

import java.util.Scanner;

public class palindrome {
    public boolean Solution(int i, String s) {
        if (i > s.length() / 2)  return true;
        
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        return Solution(i+1, s);
}
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            
            palindrome o = new palindrome();
            System.out.println(o.Solution(0, str));
        }
    }
}
