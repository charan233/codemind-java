import java.util.Scanner;
class PerfectNumberExample2  
{  
  
static long isPerfect(long num)  
{  
  
long sum=0;  
 
for(int i=1; i <= num/2; i++)  
{  
if(num % i == 0)  
{  

sum=sum + i;  
} 
}  
 
return sum;   
} 
public static void main(String args[])    
{  
long number, s;  
Scanner sc=new Scanner(System.in);         

 
number=sc.nextLong();  

s = isPerfect(number);  
  
if(s==number)  
System.out.println("True");  
else  
System.out.println("False");   
}   
}  