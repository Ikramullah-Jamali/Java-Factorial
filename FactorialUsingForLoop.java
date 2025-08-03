
import java.util.Scanner;
class FactorialUsingForLoop
{
    public static void main(String [] args)
    {  
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number for finding Factorial: ");
        int num=s.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--)
        {
          fact=fact*i; 
        }
        System.out.println("factorial of "+num+" is "+fact);
        s.close();
      }
 }
