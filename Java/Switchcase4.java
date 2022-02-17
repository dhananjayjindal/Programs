import java.util.*;

public class Switchcase4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char ch;
        ch = obj.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;

            default:

                System.out.println("consonant");
                break;
        }
    }
}
