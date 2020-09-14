package ZooAnimals;

public class Feline extends Animal
{
	public Feline(String name)
	{
		super(name);
	}
	
	public void makeNoise()
	{
		System.out.println(getName() + " purrs violently.");
	}
}
