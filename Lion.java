package ZooAnimals;

public class Lion extends Feline
{
	Lion(String name) 
	{
		super(name + "the Lion");
	}
	
	void makeNoise()
	{
		System.out.println(getName() + "heaves a mighty roar!");
	}
}
