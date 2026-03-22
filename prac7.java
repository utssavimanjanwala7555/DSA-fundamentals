import java.util.Scanner;

// Node class
class Coach 
{
    int number;
    Coach next;

    Coach(int number) 
    {
        this.number = number;
        this.next = null;
    }
}

class Train {
    Coach head = null;

    // Insert at front
    void insertFront(int num) 
    {
        Coach newCoach = new Coach(num);
        newCoach.next = head;
        head = newCoach;
        System.out.println("Coach " + num + " inserted at front.");
    }

    // Insert at end
    void insertEnd(int num) 
    {
        Coach newCoach = new Coach(num);

        if (head == null) 
            {
            head = newCoach;
            } 
            else 
            {
            Coach temp = head;
            while (temp.next != null) 
                {
                temp = temp.next;
                }
            temp.next = newCoach;
        }
        System.out.println("Coach " + num + " inserted at end.");
    }

    // Insert in sorted order
    void insertSorted(int num) 
    {
        Coach newCoach = new Coach(num);

        if (head == null || num < head.number) 
            {
            newCoach.next = head;
            head = newCoach;
            } 
            else 
            {
            Coach temp = head;
            while (temp.next != null && temp.next.number < num) 
                {
                temp = temp.next;
                }
            newCoach.next = temp.next;
            temp.next = newCoach;
        }
        System.out.println("Coach " + num + " inserted in sorted order.");
    }

    // Delete specific coach
    void deleteCoach(int num) 
    {
        if (head == null) 
        {
            System.out.println("Train is empty.");
            return;
        }

        if (head.number == num) 
            {
            head = head.next;
            System.out.println("Coach " + num + " deleted.");
            return;
            }

        Coach temp = head;
        while (temp.next != null && temp.next.number != num) 
            {
            temp = temp.next;
            }

        if (temp.next == null) 
        {
            System.out.println("Coach not found.");
        } 
        else 
        {
            temp.next = temp.next.next;
            System.out.println("Coach " + num + " deleted.");
        }
    }

    // Delete before position
    void deleteBeforePosition(int pos) 
    {
        if (head == null || pos <= 1 || head.next == null) 
        {
            System.out.println("Cannot delete before this position.");
            return;
        }

        if (pos == 2) 
        {
            head = head.next;
            System.out.println("Coach before position deleted.");
            return;
        }

        Coach temp = head;
        for (int i = 1; i < pos - 2 && temp.next != null; i++) 
        {
            temp = temp.next;
        }

        if (temp.next == null || temp.next.next == null) 
        {
            System.out.println("Invalid position.");
        } 
        else 
        {
            temp.next = temp.next.next;
            System.out.println("Coach before position deleted.");
        }
    }

    // Delete after position
    void deleteAfterPosition(int pos) 
    {
        if (head == null) 
        {
            System.out.println("Train is empty.");
            return;
        }

        Coach temp = head;
        for (int i = 1; i < pos && temp != null; i++) 
        {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) 
        {
            System.out.println("No coach exists after this position.");
        } 
        else 
        {
            temp.next = temp.next.next;
            System.out.println("Coach after position deleted.");
        }
    }

    // Display coaches
    void display() 
    {
        if (head == null) 
        {
            System.out.println("Train is empty.");
            return;
        }

        Coach temp = head;
        System.out.print("Train coaches: ");
        while (temp != null) 
        {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class prac7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Train train = new Train();
        int choice, num, pos;

        do 
        {
            System.out.println("\n--- Train Coach Menu ---");
            System.out.println("1. Insert at Front");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert in Sorted Order");
            System.out.println("4. Delete a Coach");
            System.out.println("5. Delete Before Position");
            System.out.println("6. Delete After Position");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter coach number: ");
                    num = sc.nextInt();
                    train.insertFront(num);
                    break;

                case 2:
                    System.out.print("Enter coach number: ");
                    num = sc.nextInt();
                    train.insertEnd(num);
                    break;

                case 3:
                    System.out.print("Enter coach number: ");
                    num = sc.nextInt();
                    train.insertSorted(num);
                    break;

                case 4:
                    System.out.print("Enter coach number to delete: ");
                    num = sc.nextInt();
                    train.deleteCoach(num);
                    break;

                case 5:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    train.deleteBeforePosition(pos);
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    train.deleteAfterPosition(pos);
                    break;

                case 7:
                    train.display();
                    break;

                case 8:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        sc.close();
    }
}
