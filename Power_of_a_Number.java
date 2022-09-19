import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,num1,num2,r,c=0;
        num=sc.nextInt();
        num1=sc.nextInt();
        num2=sc.nextInt();
        c=(int)Math.pow(num,num1);
        r=c%num2;
    
        System.out.println(r);
    }
}
    
