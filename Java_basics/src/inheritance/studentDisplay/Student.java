package inheritance.studentDisplay;

public class Student extends Person
{
    private int rollNo;
    private String branch;



    public Student(String name, int age, int rollNo, String branch)
    {
        super(name, age);
        this.rollNo=rollNo;
        this.branch=branch;
    }

    public void display()
    {
        super.display();
                System.out.println("Displaying student");
        System.out.println("Roll no: "+rollNo);
        System.out.println("Branch: "+branch);
    }
}
