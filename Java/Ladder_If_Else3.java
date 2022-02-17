import java.util.Scanner;
public class Ladder_If_Else3
{
    public static void main(String[] args) {
        int Units;
        Double Bill;
        Scanner obj = new Scanner(System.in);
        Units =obj.nextInt();
        if(Units<=300)
        Bill=Units*8+(Units*8*0.05);
        else if(Units<=500)
        Bill=Units*8+(Units*8*0.1);
        else 
        Bill=Units*8+(Units*8*0.2);
        System.out.println(Bill);    
    }
}