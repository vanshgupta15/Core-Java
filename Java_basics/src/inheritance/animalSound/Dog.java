package inheritance.animalSound;

public class Dog extends Animal
{
    private String breed;

    Dog(String name, int age, String breed )
    {
        super(name,age);
        this.breed=breed;
    }

    public void makeSound()
    {
        System.out.println("Woof!");
    }

    public void displayInfo()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Breed:"+breed);
    }
}
