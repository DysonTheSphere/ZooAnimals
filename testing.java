import ZooAnimals.*;
public class testing {

	public static void main(String[] args)
	{
		Rhino r = new Rhino("Rocky");
		
		System.out.println(r.getClass().getSuperclass().getSimpleName());
	}
}
