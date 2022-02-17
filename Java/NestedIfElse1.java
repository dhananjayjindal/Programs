import java.util.*;

public class NestedIfElse1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b, c;
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();
        if (a > b) {
            if (a > c)
                System.out.println(a);
            else
                System.out.println(c);

        } else {
            if (b > c)
                System.out.println(b);
            else
                System.out.println(c);

        }
    }

}
