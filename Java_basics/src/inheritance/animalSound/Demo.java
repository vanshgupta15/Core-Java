package inheritance.animalSound;

public class Demo 
{
    public static void main(String[] args) 
    {
        Dog bruno= new Dog("Bruno",6,"Labrador");
        bruno.makeSound();
        bruno.displayInfo();

        Cat billi= new Cat("Billi", 2);
        billi.makeSound();
        billi.displayInfo();

        Animal dog= new Dog("Doggy", 8, "Wild");
        dog.makeSound();
        Animal cat= new Cat("billa", 3);
        cat.makeSound();
    }
}
