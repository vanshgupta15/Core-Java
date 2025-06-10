package hashSetProject;

public class Student 
{
    private String name;
    private int age;
    private int marks;
    private int id;

    public Student(String name, int age, int marks, int id)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
        this.id=id;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getMarks()
    {
        return marks;
    }
    public int getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return "Name: "+name+"\tAge="+age+"\tMarks: "+marks+"\tId: "+id;
    }
}
