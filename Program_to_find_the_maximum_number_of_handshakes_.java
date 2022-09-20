import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t;
        p=sc.nextInt();
        t=(p*(p-1))/2;
        System.out.print(t);
        
    }
}