package ZooAnimals;

public class Feline extends Animal
{
	Feline(String name)
	{
		super(name);
	}
	
	void makeNoise()
	{
		System.out.println(getName() + " purrs violently.");
	}
}
