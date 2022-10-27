import java.util.*;
class main
{
    public static void main(String args[])
    {
       
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i,c=0;
        int arr[] = new int[N];
        
        for(i=0;i<N;i++)
          arr[i]=sc.nextInt();
         Arrays.sort(arr);
         int temp=arr[0];
         for(i=temp;i>0;i--)
         {
            c=0;
            for(int j=0;j<N;j++)
             {
                 if(arr[j]%i !=0)
                 {
                     c=1;
                 }
          
             }
             if(c==0)
             break;
             
         }
         if(c==0)
         
         System.out.print(i);
         else
         System.out.print(1);
        
            
    }
}