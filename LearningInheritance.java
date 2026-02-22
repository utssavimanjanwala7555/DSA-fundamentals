class Shape
{
    public void area()
    {
        System.out.println("Display Area");
    }
}

class Circle extends Shape
{
    public void area(int l, int h)
    {
        System.out.println("area of Circle is " + 0.5 * l * h);
    }
}

class Square extends Shape
{
    public void area(int l)
    {
        System.out.println("area of Square is " + l * l);
    }
}

public class LearningInheritance 
{
    public static void main(String [] args)
    {
       Circle c1 =new Circle();
       c1.area(5, 10);

       Square s1 = new Square();
       s1.area(8);
    }
}
