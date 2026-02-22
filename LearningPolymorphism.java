class Student
{
    String name;
    int age;

    public void printInfo(String name)
    {
        System.out.println("name: " + name);
    }

    public void printInfo(int age)
    {
        System.out.println("age:" + age);
    }

    public void printInfo(String name, int age)
    {
        System.out.println("name:" + name + " " +"age:" + age);
    }
}



public class LearningPolymorphism 
{
    public static void main(String [] args)
    {
        Student s1 = new Student();
        s1.name = "Romil";
        s1.age = 15;

        s1.printInfo(s1.name, s1.age);
    }    
}

