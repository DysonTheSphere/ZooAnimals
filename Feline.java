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
	public void roam(){
        	System.out.println(getName() + " roams in the forest.");
    	}
}
