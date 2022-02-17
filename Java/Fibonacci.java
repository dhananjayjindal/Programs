import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n,i,x=0,y=1,z;
        n=obj.nextInt();
        System.out.println("series is :");    
        for(i=1;i<=n;i++)
        {
            System.out.println(x);    
            z=x+y;
            x=y;
            y=z;
        }
    }
}