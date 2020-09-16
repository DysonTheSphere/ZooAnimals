package ZooAnimals;

public class Cat extends Feline
{
	public Cat(String name) 
	{
		super(name + " the Cat");
	}
	public void eat()
    	{
    		System.out.println(getName() + " eats some rabbits.");
	}
}
