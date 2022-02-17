import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int a, b, c;
        a = obj.nextInt();
        b = obj.nextInt();
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
            System.out.println(a);
        }
    }
}   