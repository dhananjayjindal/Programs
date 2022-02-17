import java.util.*;
public class Ladder_If_Else4
{
    public static void main(String[] args) {
        int Stocks;
        char Level;
        Scanner obj = new Scanner(System.in);
        Stocks =obj.nextInt();
        if(Stocks<=1000)
        Level='A';
        else if(Stocks<=5000)
        Level='B';
        else 
        Level='C';
        System.out.println(Level);    
    }
}