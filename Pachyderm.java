package ZooAnimals;

public class Pachyderm extends Animal
{
    Pachyderm(String name)
    {
        super(name);
    }

    void roam(){
        System.out.println(name + " roams in the grasslands.");
    }

    void charge()
    {
        System.out.println(name + " decides to charge.");
    }

}
