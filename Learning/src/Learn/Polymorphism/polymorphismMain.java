package Learn.Polymorphism;

public class polymorphismMain extends allMethods {
	
	public void getvalues()
	{
		int n=10;
		String name="Virat";
		double avg=50.15;
		System.out.println("The values are "+name+" matches "+n+" with avg of "+avg);
	}

	public static void main(String[] args) {
		
		polymorphismMain obj1=new polymorphismMain();
		obj1.getvalues();
		obj1.getvalues(72, "Virat Century");
		obj1.getvalues("King ", "Kohli");
		
		allMethods obj2=new allMethods();
		obj2.getvalues();
		

	}

}
