package guviAssignment;

import java.util.*;

class parent{
	public String name="This is Parent String";
	void display() {
		System.out.println(name);
	}
}

class child extends parent{
	public String name="This is Child String";
	
	void display() {
		System.out.println(name);
		System.out.println(super.name);
	}
	void print() {
		child obj=new child();
		obj.display();
		super.display();
	}
	
}

public class inheritedStringClass {
	
	public static void main(String args[])
	{
		child obj=new child();
		obj.print();
	}

}
