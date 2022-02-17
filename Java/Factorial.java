import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n,i,f=1;
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);    
    }
}