import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while((int)Math.log10(num)+1!=1)
        {
            int temp=num;
            int sum=0;
            while(temp>0)
            {
                sum=sum+temp%10;
                temp=temp/10;
            }
            num=sum;
        }
         
          System.out.print(num);
    }
}