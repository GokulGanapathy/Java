package Learn.Classes;

public class ClassB extends ClassA {
	public String name="Anand";
	ClassB(){
		System.out.println(name);
	}
	
	public static void main(String args[])
	{
		ClassB objB=new ClassB();
		System.out.println(objB.name);
		
		ClassA objA=new ClassA();
		objA.printA();
		System.out.println("This is in Derived Class : "+objA.name);
		
		String vill=objA.nativeVill;
		System.out.println(vill);
	}
	
	public void printB()
	{
		System.out.println("This is on ClassB");
	}
}
