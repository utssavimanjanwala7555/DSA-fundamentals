import java.util.Scanner;

public class prac3 
{
    
        static void hanoi(int n, char src, char aux, char dest)
        {
            if (n == 1)
            {
                System.out.println("Move disk 1 from " + src + " to " + dest);
                return;
            }

            //step1: move n-1 disks from source to auxiliary
            hanoi(n-1, src, dest, aux);
               
            //step2: move n disk from source to destination
            System.out.println("Move disk " + n + " from " + src + " to " + dest);

            //step3: move n-1 disks from auxiliary to destination
            hanoi(n-1, aux, src, dest);

        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of disks: ");
            int disks = sc.nextInt();

            hanoi(disks, 'A','B','C');

            sc.close();
        }

    
}
