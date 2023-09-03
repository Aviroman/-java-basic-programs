import java.util.*;
public class demo4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int mynum = (int)(Math.random()*100);
        int userNumber=0;
        do
        {
            System.out.println("guess my number");
            userNumber=sc.nextInt();
            if(userNumber == mynum){
                System.out.println("wahoo");
                break;
            }
            else if (userNumber > mynum){
                System.out.println("your num is too large");
            }
            else{
            System.out.println("your num is too small");
            }
        }while(userNumber >=0);
            System.out.println("my num was ; ");
            System.out.println(mynum);
            
        }

    
}    
