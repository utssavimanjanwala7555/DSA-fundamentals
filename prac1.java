import java.util.Scanner;
import javax.sound.midi.SysexMessage;

public class prac1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int count = 0;
         
        System.out.println("Select the operation you want to perform:");
        System.out.println("1) Insert");
        System.out.println("2) Delete");
        System.out.println("3) Search");
        System.out.println("4) Update");
        System.out.println("5) Display");
        System.out.println("6) Exit");
        
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1: 
            if(count == size)
            {
                System.out.println("Array is full. Cannot insert new element.");
            }
            else
            {
                System.out.println("ENter an element to insert:");
                int element = sc.nextInt();
                arr[count] = element;
                count++;
            }
            break;


            case 2: 
            if(count == 0)
            {
                System.out.println("Array is empty. Cannot delete element");
            }
            else
            {
                
            }
            break;

            case 3: 
            break;

            case 4: 
            break;

            case 5: 
            break;

            case 6: 
            break;
        }
         

    }    
}
