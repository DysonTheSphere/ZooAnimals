package ZooAnimals;

public class Lion extends Feline
{
	public Lion(String name) 
	{
		super(name + " the Lion");
	}
	
	public void makeNoise()
	{
		System.out.println(getName() + "heaves a mighty roar!");
	}
}
