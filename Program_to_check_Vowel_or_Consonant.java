import java.util.Scanner;
class demo
{
    
    public static void main(String Args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        
        ch=sc.nextLine().charAt(0);
        switch(ch)
        {
            case'A':
            case'a':
            case'E':
            case'e':
             case'I':    
         case'i':                       
         case'O':
        case'o':
         case'U':
        case'u':
            System.out.println("Vowel");
            break;
            default:
               System.out.println("Consonant");
               break;
                          
                          
                          
        }
        
        
    }
}