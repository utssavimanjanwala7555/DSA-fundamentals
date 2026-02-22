class Pen
{
    String colour;
    String type;

    public void write()
    {
        System.out.println("writing an essay");
    }

    public void printColour()
    {
        System.out.println(this.colour);
    }

}


class Student
{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class LearningOOPS 
{   
    public static void main(String [] args)
    {
        Pen pen1 = new Pen();
        pen1.colour = "black";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.colour = "red";
        pen2.type = "inkpen";

        pen1.write();

        pen1.printColour();
        pen2.printColour();

        Student s1 = new Student();
        s1.name = "Romil";
        s1.age = 15;
        s1.printInfo();
    }
}
