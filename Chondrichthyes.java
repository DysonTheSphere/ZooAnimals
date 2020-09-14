package ZooAnimals;

public class Chondrichthyes extends Animal
{
    Chondrichthyes(String name)
    {
        super(name);
    }
    void roam()
    {
		System.out.println(getName() + " roams in the water.");
	}
}
