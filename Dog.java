package ZooAnimals;

public class Dog extends Canine
{
	Dog(String name)
	{
		super(name + "the Dog");
	}
	
	void makeNoise()
	{
		System.out.println(getName() + " gives a playful bark as it wags it's tail.");
	}
	
	void dig()
	{
		System.out.println(super.getName() + " digs a huge hole in the earth.");
	}
}
