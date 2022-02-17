import java.util.Scanner;
public class Ladder_If_Else2
{
    public static void main(String[] args) {
        int Salary,Bonus;
        Scanner obj = new Scanner(System.in);
        Salary = obj.nextInt();
        if(Salary<=10000)
        Bonus=1000;
        else if(Salary>10000&&Salary<=30000)
        Bonus=2000;
        else 
        Bonus = 5000;
        System.out.println(Salary+Bonus);    
    }
}