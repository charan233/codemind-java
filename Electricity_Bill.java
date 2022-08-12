import java.util.*;
class sample
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int units;
    String id,name;
    float bill=0.0f,sur,total=0.0f;
    id=sc.nextLine();
    name=sc.nextLine();
    units=sc.nextInt();
  if(units<=199)
    total=units*1.20f;
  else if(units>=200 && units<400)
    total=units*1.50f;
  else if(units>=400 && units<600)
    total=units*1.80f;
  else
    total=units*2.0f;
 if(total>400)
     total=total+0.15f*total;
else 
     total=total+100;
  System.out.format("%.2f",total);
  }
}