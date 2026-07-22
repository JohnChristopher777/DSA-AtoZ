package hashing;

import java.util.Scanner;

//time complexity - O(Q+N)
public class charhash {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String str = s.nextLine();
            
            //precompute
            int[] hash = new int[256];
            for (int i = 0; i < str.length(); i++) {
                hash[str.charAt(i)]++; //hash[str.charAt(i) - 'a']++; or hash[str.charAt(i) - 'A'] if only upper or samaller case
            }
            
            System.out.println("Enter the number of queries: ");
            int q = s.nextInt();
            while (q-- > 0) {
                char c = s.next().charAt(0);

                System.out.println(c+" appears " + hash[c] + " times in the given string."); //hash[c-'a'] or [c - 'A']
            }
        }
    }
}
