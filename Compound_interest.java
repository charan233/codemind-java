import java.util.Scanner;
class sample
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double p=sc.nextInt();
        double r=sc.nextInt();
        double t=sc.nextInt();
        double a=p*Math.pow((1+(r/100)),t);
        System.out.format("%.2f",a);
    }            
}