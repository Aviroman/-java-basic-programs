import java.util.*;

public class test
{
    public static void main(String Arg[])
    {
        int Row=0;
        int Col=0;
        Scanner sobj=new Scanner(System.in);
        System.out.print("Enter Rows");
        Row=sobj.nextInt();

        System.out.print("Enter Columns");
        Col=sobj.nextInt();

        int i=0;
        int j=0;
        for(i=1;i<=Row;i++)
        {
            for(j=1;j<=Col;j++)
            {
                if(i==1)
                {
                    System.out.print("*");
                }
                else if(j==1)
                {
                   System.out.print("*"); 
                }
                else if(j==Row)
                {
                    System.out.print("*");
                }
                else if(i==Col)
                {
                   System.out.print("*"); 
                }
                // else if(i==j)
                // {
                //     System.out.print("*"); 
                // }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        
    }
}
