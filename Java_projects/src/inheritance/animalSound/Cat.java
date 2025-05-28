package inheritance.animalSound;

public class Cat extends Animal
{
    Cat(String name, int age)
    {
        super(name,age);
    }
    public void displayInfo()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public void makeSound()
    {
        System.out.println("meowww");
    }
}
