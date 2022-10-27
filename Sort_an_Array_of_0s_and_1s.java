import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        int N,temp;
        int arr[];
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N];
        for(int i=0;i<N;i++)
          arr[i]=sc.nextInt();
          for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}