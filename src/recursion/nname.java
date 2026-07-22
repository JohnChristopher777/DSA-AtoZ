package recursion;
import java.util.*;

public class nname {
    public void myname(String name, int count ,int n) {
        if (count == n) {       //base condition
            return;
        }
        System.out.print(name);

        myname(name, count + 1, n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = s.nextLine();
        System.out.println("Enter n:");
        int n = s.nextInt();
        nname obj=new nname();
        obj.myname(name, 0, n);
        System.out.println();
        s.close();
    }
}
