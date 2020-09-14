package ZooAnimals;

public class Dog extends Canine
{
	public Dog(String name)
	{
		super(name + " the Dog");
	}
	
	public void makeNoise()
	{
		System.out.println(getName() + " gives a playful bark as it wags it's tail.");
	}
	
	public void dig()
	{
		System.out.println(super.getName() + " digs a huge hole in the earth.");
	}
}
