import java.util.Scanner;
class main
{
    public static int findDivisons(int m,int n,int k)
    {
        int count=0;
        for (int i=m;i<=n;i++)
        {
            if(i%k==0)
             count++;
        }
          return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int start,end,k,result;
        start=sc.nextInt();
        end=sc.nextInt();
        k=sc.nextInt();
        result=findDivisons(start,end,k);
        System.out.println(result);
    }
}
    
