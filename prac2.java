import java.util.Scanner; 

public class prac2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Stack");
        int max = sc.nextInt();
        int stack[] = new int[max];
        int top = -1;
        int choice;

        do
        {
            System.out.println("Select the operation you want to perform;");
            System.out.println("1. PUSH");
            System.out.println("2.POP");
            System.out.println("3.PEEP");
            System.out.println("4.DISPLAY");
            System.out.println("5.EXIT");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                break;

                case 2:
                break;

                case 3:
                break;

                case 4:
                break;

                case 5:
                break;
            }
        }
        while(choice != 5);
    
    }
}
