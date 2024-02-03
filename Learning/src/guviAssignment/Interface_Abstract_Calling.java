package guviAssignment;

import java.util.Scanner;

public class Interface_Abstract_Calling extends abstractAssign implements stringInterface {
	
	public String Interface_Abstract_Calling(int n) {
		
		String str=Integer.toString(n);
		return str;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String addr=sc.nextLine();
		
		
		Interface_Abstract_Calling obj=new Interface_Abstract_Calling();
		
		int n=sc.nextInt();
		String str=obj.Interface_Abstract_Calling(n);
		System.out.println(str);
		
		
		obj.getStringOutput();
		System.out.println("The addrs is : "+obj.printAddr(addr));
		System.out.println("The name is : "+obj.printName(name));
		obj.printMethod();
		obj.printMethod1();
		

	}
	
	//Defining all unimplemented method of Interface and Abstract Class
	
	public void getStringOutput() {
		
		System.out.println("Its a String Interface Calling method");
		
	}
	public String printName(String name) {
		//System.out.println("The name is : "+name);
		return name;
		
	}
	public String printAddr(String addr) {
	
		//System.out.println("The address is : "+addr);
		return addr;
	
	}
	
	public void printMethod1() {
		System.out.println("The print method 1 of abstract class");
	}
	

}
