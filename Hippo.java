package ZooAnimals;

public class Hippo extends Pachyderm
{
    Hippo(String name){
        super(name + " the Hippo");
    }
    void eat(){
				System.out.println(name + " eats some grass.");
		}
}
