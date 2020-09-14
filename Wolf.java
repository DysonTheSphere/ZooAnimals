package ZooAnimals;

public class Wolf extends Canine
{
	Wolf(String name) 
	{
		super(name + "the Wolf");
	}
	
	void makeNoise()
	{
		System.out.println(getName() + " makes a loud grumble as if it wants to eviscerate an animal.");
	}
}
