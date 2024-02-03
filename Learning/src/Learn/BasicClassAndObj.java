package Learn;

import java.util.*;

public class BasicClassAndObj {
	
	public static int a_age;
	static String a_name;
	static long a_empId;
	static boolean a_competent;
	
	public void empDetailsPrint()
	{
		System.out.println("Emp_name :"+ a_name);
		System.out.println("Age :"+a_age);
		System.out.println("EmployeeId :"+ a_empId);
		System.out.println("Is the employee Competent :"+ a_competent);
		
	}
	
	public BasicClassAndObj()       					// this is a Constructor
	{
		Scanner sc=new Scanner(System.in);
		a_age=sc.nextInt();
		a_name=sc.next();
		a_empId=sc.nextLong();
		a_competent=sc.nextBoolean();
		System.out.println("Inside Constructor");
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*a_age=sc.nextInt();
		a_name=sc.next();
		a_empId=sc.nextLong();
		a_competent=sc.nextBoolean();*/
		
		BasicClassAndObj obj=new BasicClassAndObj();    // Creating a Object for this class
		obj.empDetailsPrint();							// Calling the Object and passing the values if required
	}

}
