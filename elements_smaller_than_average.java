import java.util.*;
class UniqeOdd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int sum=0;
        int c=0;
        for(int i=0;i<N;i++)
        
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int avg=(int)sum/N;
        for(int i=0;i<N;i++)
        {
        if(arr[i]<=avg)
        c++;
        }
        
        
           System.out.println(c);
        
          
         sc.close();
    }
}