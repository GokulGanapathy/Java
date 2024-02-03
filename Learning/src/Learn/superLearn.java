package Learn;

class A {
	A(){
		System.out.println("In Constructor");
	}
	String name="Gokul";
	void displayName() {
		System.out.println("Parent Class : "+name);
	}
}

class B extends A {
	/*B(){
		super();
	}*/
	String name="Anand";
	void displayName() {
		System.out.println("Derived Class : "+name);
		System.out.println("the value of name using super : "+super.name);
	}
	void calling() {
	super.displayName();
	}
}

public class superLearn {
	public static void main(String args[])
	{
		B obj=new B();
		System.out.println(obj.name);
		obj.displayName();
		obj.calling();
	}

}
