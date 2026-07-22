package hashing;

import java.util.Scanner;


//only for num with specific size
//time complexity - O(N+Q) instead of brute force - O(Q*N)

public class numhash {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the size of the Array: ");
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            //precompute
            int[] hash = new int[13]; 
            for (int i = 0; i < n; i++) {
                hash[arr[i]] += 1;
            }
            System.out.print("Enter number of queries: ");
            int q = s.nextInt();
            while (q-- > 0) {
                int num = s.nextInt();
                //fetching
                System.out.println( num + " appears " + hash[num]+ " times in the array");
            }
        }
    }
}
