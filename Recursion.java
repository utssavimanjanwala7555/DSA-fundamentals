public class Recursion 
{

    public static int printSum(int n) //n=5
    {
        if(n == 0)
        {
            return 0;
        }

        int result = n + printSum(n-1);
        return result;
    }


    public static void main(String[] args)
    {
        System.out.println(printSum(5));
    }
}
