
import java.util.Scanner;
class FactorialRecursiveWithUserInput
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        int result=calcFact(num);
        System.out.println("factorial of "+num+" is "+result);
        s.close();
    }
    static int calcFact(int num)
    {
        if(num<=1)
        return 1;
        return num*calcFact(num-1);
    }
}