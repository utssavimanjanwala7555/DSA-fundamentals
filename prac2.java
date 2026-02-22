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
                case 1://push
                    if(top == max -1) 
                    {
                        System.out.println("Stack Overflow.Cannot enter new element.");
                    }
                    else
                    {
                        System.out.println("Enter an element to push:");
                        int element = sc.nextInt();
                        top++;
                        stack[top] = element;
                    }
                break;

                case 2://pop
                    if(top == -1)
                    {
                        System.out.println("Stack Underflow. Cannot delete element.");
                    }
                    else
                    {
                        int deleted = stack[top];
                        top--;
                        System.out.println("Deleted element :" + deleted);
                    }
                break;

                case 3://peep
                    if(top == -1)
                    {
                        System.out.println("Stack is empty.");
                    }
                    else
                    {
                        System.out.println("Top element is "+ stack[top]);
                    }
                break;

                case 4://display
                    if(top == -1)
                    {
                        System.out.println("Stack is empty.");
                    }
                    else
                    {
                        System.out.println("Stack elements are:");

                        for(int i = top; i >= 0; i--)
                        {
                            System.out.println(stack[i]);
                        }
                    }
                break;

                case 5:
                    System.out.println("Exiting the program.");
                break;
            }
        }
        while(choice != 5);
    
    }
}
