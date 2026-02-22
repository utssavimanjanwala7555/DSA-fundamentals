public class factorialUsingRecursion 
{

    public static int factorial(int n)
    {

        if(n == 0)
        {
            return 1;
        }

        int result =  n * factorial(n-1);
        return result;
    }

    public static void main(String [] args)
    {
        System.out.println(factorial(5));
    }
    
}
