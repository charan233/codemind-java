import java.util.Scanner;
class demo
{
    public static int findsumdigit(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static int findproddigit(int n)
    {
        int prod=1,r;
        while(n>0)
        {
            r=n%10;
            prod=prod*r;
            n=n/10;
        }
        return prod;
    }
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,res1,res2;
        n=sc.nextInt();
        res1=findsumdigit(n);
        res2=findproddigit(n);
    if(res1==res2)
        {
            System.out.println("Spy Number");
        }
    else
            System.out.println("Not Spy Number");
        
    }
}