package ZooAnimals;

public class Animal 
{
	private String name;

	public Animal(String name)
	{
		this.name = name;
	}
	
    public String getName()
    {
        return name;
    }
	
	void wakeUp()
	{
		System.out.println(name + " awakens from a deep slumber.");
	}
	void sleep()
	{
		System.out.println(name + " falls into a sleepy stupor.");
	}
	void makeNoise()
	{
		System.out.println(name + " emits an audible response.");
	}
	void roam()
	{
		System.out.println(name + " roams.");
	}
	void eat() 
	{
		System.out.println(name + " eats.");
	}
}
