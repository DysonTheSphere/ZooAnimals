package ZooAnimals;

public class Pachyderm extends Animal
{
    public Pachyderm(String name)
    {
        super(name);
    }

    public void roam(){
        System.out.println(getName() + " roams in the grasslands.");
    }

    public void charge()
    {
        System.out.println(getName() + " decides to charge.");
    }

}
