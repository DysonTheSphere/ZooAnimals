package ZooAnimals;

public class Rhino extends Pachyderm
{
    Rhino(String name){
        super(name + " the Rhino");
    }
    void eat()
    {
		System.out.println(getName() + " eats some fruit.");
	}
}
