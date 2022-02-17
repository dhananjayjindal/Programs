import java.util.*;
public class Switchcase3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int r,a,b,c;
        char ch;
        double area;
        ch=obj.next().charAt(0);
        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            r = obj.nextInt();
            area=r*r*3.14;
                System.out.println(area);
                break;
            case 'd':
            case 'f':
            a=obj.nextInt();
            b=obj.nextInt();
            c=obj.nextInt();
            if(a>b&&a>c)
            System.out.println("a is big");
            else if(b>c&&b>a)
            System.out.println("b is big");
            else 
            System.out.println("c is big");
                break;
            default:
                break;
        }
    }
}
