import java.util.*;
public class Switchcase2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int k,f;
        double c;
        char ch;
        k = obj.nextInt();
        switch (k) {
            case 1:
            case 3:
            case 5:
            f = obj.nextInt();
            c=(f-32)/1.8;
                System.out.println(c);
                break;
            case 2:
            case 4:
            ch=obj.next().charAt(0);
            if(ch>=65&&ch<91)
            System.out.println("Upper Case");
            else if(ch>=97&&ch<123)
            System.out.println("Lower Case");
            else 
            System.out.println("Not An Alphabet");
                break;
            default:
                break;
        }
    }
}
