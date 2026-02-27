import java.util.Scanner;

public class prac6 
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Circular Queue:");
        int size = sc.nextInt();
        int queue[] = new int[size];

        int choice;

        int front = -1;
        int rear = -1;

        
        do
        {
            System.out.println("Select operation you want to perform on circular queue;");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Get front position");
            System.out.println("4.Get rear position");
            System.out.println("5.Check if Circular queue is empty or not");
            System.out.println("6Check if Circular queue is full or not");
            System.out.println("7.Exit");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1 : 
                    if ((rear + 1) % size == front) 
                    {
                        System.out.println("Queue is full. Cannot insert.");
                    }
                    else
                    {
                        if (front == -1) 
                        {
                            front = 0;
                        }

                        System.out.println("Enter new element:");
                        int element = sc.nextInt();
                        rear =(rear + 1) % size;
                        queue[rear] = element;
                    }
                break;

                case 2 :
                    if(front == -1)
                    {
                        System.out.println("Queue is empty. Cannot delete an element.");
                    }
                    else
                    {
                        int delete = queue[front];
                        
                        if (front == rear) 
                        {
                            front = -1;
                            rear = -1;
                        }
                        else
                        {
                            front = (front + 1) % size;
                            System.out.println("Deleted element :" + delete);
                        }
                    }
                break;

                case 3 :
                    if(front == -1)
                    {
                        System.out.println("Position of front is : -1");
                    }
                    else
                    {
                        System.out.println("Position of front is :" + front);
                    }
                break;

                case 4 :
                    if(rear == -1)
                    {
                        System.out.println("Position of rear is : -1.");
                    }
                    else
                    {
                        System.out.println("Position of rear is : " + rear);
                    }
                break;
                
                case 5 :
                    if(front == -1)
                    {
                        System.out.println("Queue is empty.");
                    }
                    else
                    {
                        System.out.println("QUeue is not empty.");
                    }
                break;

                case 6 :
                    if((rear + 1) % size == front)
                    {
                        System.out.println("Queue is full.");
                    }
                    else
                    {
                        System.out.println("Queue is not full.");
                    }
                break;

                case 7 :
                    System.out.println("Program Exited.");
                break;
       
            }
        }

        while(choice !=7);
    }    
}
