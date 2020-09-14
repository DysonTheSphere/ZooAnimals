package ZooAnimals;

public class Ray extends Chondrichthyes
{
    Ray(String name)
    {
        super(name + " the Ray");
    }
    void eat()
    {
    	System.out.println(getName() + " eats some krill.");
	}
}
