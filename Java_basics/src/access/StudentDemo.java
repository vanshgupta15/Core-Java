package access;

public class StudentDemo 
{
        public static void main(String[] args) 
        {
        System.out.println("Hello, World!");

        Student s1 = new Student();
        System.out.println("Student Created");
        // s1.name = "Ravi";
        s1.display();

        Student s2 = new Student(10, "John");
        System.out.println("Student Created 2");
        s2.display();

        System.out.println("World Ended");
        }
}
