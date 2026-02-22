import java.util.ArrayList;

public class LearnArrayList 
{
    public static void main(String [] args)   
    {
        ArrayList<Integer> list = new ArrayList<>(); 

        //add elements
        list.add(3);
        list.add(5);
        list.add(8);

        System.out.println(list);

        //get element
        int element = list.get(2);
        System.out.println(element);

        //add elements in between
        list.add(2, 6);
        System.out.println(list);

        //set element
        list.set(0,7);
        System.out.println(list);

        //delete element
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loop
        for(int i = 0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    } 
}
