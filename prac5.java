import java.util.Scanner;

public class prac5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of queue:");
        int max = sc.nextInt();
        int queue[] = new int[max];

        int rear = -1;
        int front = -1;
        int choice;

        do
        {
            System.out.println("Please select the operation you want to perform:");
            System.out.println("1.ENQUEUE");
            System.out.println("2.DEQUEUE");
            System.out.println("3.DISPLAY");
            System.out.println("4.EXIT");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                if(front == -1)
                {
                    front = 0;
                }

                if(rear >= max)
                {
                    System.out.println("Queue is full.");
                }
                else
                {
                    System.out.println("Enter an element to enqueue:");
                    int element = sc.nextInt();
                    rear++;
                    queue[rear] = element;
                }
                break;

                case 2:
                if(front == -1)
                {
                    System.out.println("Queue is empty.Cannot delete");
                }
                else
                {
                    int deleted = queue[front];
                    front++;
                    System.out.println("Deleted element: " + deleted);
                }
                break;

                case 3:
                for(int i = front; i <= rear; i++)
                {
                    System.out.println(queue[i]);
                }
                break;
                
                case 4:
                System.out.println("Exiting the program.");
                break;
            }
        }
        while(choice != 4);
    }
}
