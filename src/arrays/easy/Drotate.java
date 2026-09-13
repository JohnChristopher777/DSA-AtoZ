package arrays.easy;

import java.util.*;

public class Drotate {
    public void Leftbrute(int[] arr, int d, int n) {
        if (n == 0)
            return;

        d = d % n;

        int[] temp = Arrays.copyOfRange(arr, 0, d);

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }

    }
    
    public void Rightbrute(int[] arr, int d, int n) {
        if (n == 0)
            return;

        d = d % n;

        int[] temp = Arrays.copyOfRange(arr, n - d, n);

        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }

        System.arraycopy(temp, 0, arr, 0, d); //to copy source to destination of an array
    }

    public void optimal(int[] arr, int d, int n, String dir) {

        if (d == 0 || n == 0)
            return;

        d = d % n;
        
        if (dir.equals("l")) {
            rev(arr, 0, d-1);
            rev(arr, d, n-1);
            rev(arr, 0, n-1);    
        }
        else if(dir.equals("r")){
            rev(arr, 0, n - 1);
            rev(arr, 0, d - 1);
            rev(arr, d, n - 1);
        }


    }
    
    void rev(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
        public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in);) {
            int n = s.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println("Enter D:");
            int d = s.nextInt();

            s.nextLine(); //to catch bug of skipping String after a int scan

            System.out.println("Enter r for right rotate and l for left rotate:");
            String dir = s.nextLine();

            Drotate obj = new Drotate();
            //obj.Leftbrute(arr, d, n);
            //obj.Rightbrute(arr, d, n);
            obj.optimal(arr, d, n, dir);

            System.out.println(Arrays.toString(arr));
        }
    }
}