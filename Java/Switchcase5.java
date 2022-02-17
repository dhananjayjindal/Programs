import java.util.*;

public class Switchcase5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int k, c;
        c = obj.nextInt();
        k = c % 2;
        switch (k) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                break;
        }
    }
}
