package ZooAnimals;

public class Dog extends Canine
{
	Dog(String name)
	{
		super(name + "the Dog");
	}
	
	void dig()
	{
		System.out.println(super.getName() + "digs a huge hole in the earth.");
	}
}
