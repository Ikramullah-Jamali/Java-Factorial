 
class FactorialRecursiveWithoutUserInput
{
    public static void main(String[]args)
    {
        int num=5;
        int result=calcFact(num);
        System.out.println("Factorial of "+num+" is "+result);
    }
    static int calcFact(int num)
    {
        if(num<=1)
        return 1;
        return num*calcFact(num-1);
    }
}