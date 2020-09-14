package ZooAnimals;

public class Elephant extends Pachyderm
{
    Elephant(String name){
        super(name + " the Elephant");
    }
    void eat(){
				System.out.println(name + " eats some roots.");
		}
}
