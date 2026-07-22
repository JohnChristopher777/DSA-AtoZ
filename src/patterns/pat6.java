package patterns;

import java.util.Scanner;

public class pat6 { //pattern 15,16,17 and 18
    public void ARAT(int N) { //right angled triangle with increasing alphabet and restarting from A for each row
        for (int i = 1; i <= N; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void IARAT(int N) { // inverted right angled triangle with increasing alphabet and restarting from A for each row
        for (int i = N; i >= 1; i--) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public void AiRAT(int N) { //right angled triangle with alphabet at i repeated j times in each row
        for (char i = 'A'; i < 'A' + N; i++) { //for (int i = 0; i < N; i++)
                                               // char ch = (char) ('A' + i);
            for (char j = 'A'; j <= i; j++) { //for (int j = 0; j <= i; j++)
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    public void eql(int N) { //equilateral triangle pattern with alphabet
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i - 1) / 2;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public void ERAT(int N) { //equilateral triangle pattern each row ends with 'E'
        for (int i = 0; i < N; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
          System.out.println();
        }
    }

        public static void main(String[] args) {
        pat6 p = new pat6();
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        //p.ARAT(N);
        //p.IARAT(N);
        //p.AiRAT(N);  
        //p.eql(N);
        p.ERAT(N);
        s.close();
    }   
}
