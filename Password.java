// 1.Password length must be 8 or more
// 2.Password must contain letters and digits
// 3.There should not be any special characters
import java.util.Scanner;

public class Password 
{
    public static void main(String args[])
    {
        String s;
        int n,i,m=0,y=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a password:");
        s = in.nextLine();
        char c[] = s.toCharArray();
        n=c.length;
        for(i=0;i<n;i++)
        {
            if((c[i]>=32&&c[i]<=47)||(c[i]>=58&&c[i]<=64))
            {
                m=1;
                break;
            }
        }
        for(i=0;i<n;i++)
        {
            if(c[i]>=48&&c[i]<=57)
            {
                y=1;
                break;
            }
        }
        if(m==0&&n>=8&&y==1)
        System.out.println("Password is VALID");
        else System.out.println("Password is IN VALID");
    }    
}
