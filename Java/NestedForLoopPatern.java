import java.util.Scanner;
public class NestedForLoopPatern {
    


    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n,i;
        for(i=1;i<=5;i++)
        {
        System.out.println(i);    
            for(n=1;n<=i;n++){
        System.out.println(i);}    
        }
    }
}