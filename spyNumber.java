import java.util.Scanner;
class spyNumber
{
    public static void main(String args[])
    {
        int n,sum=0,pro=1,k;
        System.out.println("Enter the value:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while(n>0)
        {
            k = n % 10;
            sum = sum +k;
            pro = k * pro;
            n = n / 10;
        }
        System.out.println("Sum ="+sum);
        System.out.println("product ="+pro);
        if(sum == pro)
        {
            System.out.println("The number is a spy number");
        }
        else
        {
            System.out.println("The number is not a spy number");
        }
    }
}
