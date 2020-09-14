package ZooAnimals;

public class Shark extends Chondrichthyes
{
    Shark(String name)
    {
        super(name + " the Shark");
    }
    void eat()
    {
    	System.out.println(getName() + " eats some turtles.");
	}

}
