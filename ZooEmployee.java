import java.util.ArrayList;
import ZooAnimals.*;
import java.lang.Math.*;

public class ZooEmployee extends ZooKeeper
{	
	private ArrayList<ZooAnimals.Animal> zoo;
	
	ZooEmployee(ArrayList zoo)
	{
		this.zoo = zoo;
	}

	@Override
	void awakenAnimals() 
	{
		for (ZooAnimals.Animal a : zoo)
		{
			System.out.println("Zookeeper wakes up " + a.getName());
			a.wakeUp();
		}
	}

	@Override
	void rollCall() 
	{
		System.out.println("Zookeeper takes roll");
		for (ZooAnimals.Animal a : zoo)
		{
			a.makeNoise();
		}
	}

	@Override
	void feeding() 
	{
		for (ZooAnimals.Animal a : zoo)
		{
			System.out.println("Zookeeper feeds " + a.getName());
			a.eat();
		}
	}

	@Override
	void exerciseAnimals() 
	{
		for (ZooAnimals.Animal a : zoo)
		{
			int rng = (int) ((Math.random() * 100) + 1);
			
			//Special Cases
			//dog digs 25% of the time
			if (a.getClass().getSimpleName() == "Dog")
			{
				ZooAnimals.Dog dog = (Dog) a;
				if (rng <= 25)
					dog.dig();
				else
					dog.roam();
			}else if (a.getClass().getSuperclass().getSimpleName() == "Pachyderm") //Pachyderm charges 25% of the time
			{
				Pachyderm pachy = (Pachyderm) a;
				if (rng <= 25)
					pachy.charge();
				else
					pachy.roam();
			}else a.roam();
			
			
		}
	}

	@Override
	void tuckIn() 
	{
		
		for (ZooAnimals.Animal a : zoo)
		{
			System.out.println("Zookeeper tucks in " + a.getName());
			//Cats don't care what you tell them
			if (a.getClass().getSuperclass().getSimpleName() == "Feline")
			{
				int rng = (int) ((Math.random() * 100) + 1);
				if (rng <= 30)
					a.roam();
				if (rng > 70)
					a.makeNoise();
				else
					a.sleep();
					
			}
		}
	}

}
