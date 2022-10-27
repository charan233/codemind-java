import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        int N,T;
        int p=0;
        int[]arr;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N];
        for(int i=0;i<N;i++)
          arr[i]=sc.nextInt();
         T=sc.nextInt();
         for(int i=0;i<N;i++)
         {
             if(arr[i]<=T)
             p=p+1;
             else
             p=p+2;
             
         }
         System.out.print(p);
        
            
    }
}