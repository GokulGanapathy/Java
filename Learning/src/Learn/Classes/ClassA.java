package Learn.Classes;

public class ClassA {
	public String name="Gokul";
	//ClassA(){
	//System.out.println(name);}
	private String profession="QA";
	protected String nativeVill="Kovilpatti";
	public void printA()
	{
		System.out.println("this is on Class_A");
		ClassA objA=new ClassA();
		System.out.println(objA.profession);
	}
	public  static void main(String args[])
	{
		ClassA objA=new ClassA();
		System.out.println(objA.profession);
		objA.printA();
	}

}
