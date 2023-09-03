import java.util.Scanner;
class assignment1
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a amount you have paid");

        double fee = sc.nextDouble();
        

        if(fee<35000)
        {
            System.out.println("pay the amount and attend the class");

        }
        System.out.println("attend the class");
    }
}