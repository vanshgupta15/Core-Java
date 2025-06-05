package inheritance.animalSound;

public class Animal 
{
     String name;
     int age;

    public Animal() {
    }

    public Animal(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public void makeSound()
    {
        System.out.println("Bhowww....Bhowwwww");
    }
}
