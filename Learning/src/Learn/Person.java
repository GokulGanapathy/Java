package Learn;
import java.util.*;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String adr=sc.nextLine();
		long number=sc.nextLong();
		Person p=new Person();
		p.member(name, adr, number);
	}
	
	public void member(String name,String addr,long num)
	{
		System.out.println("Name is : "+name);
		System.out.println("Address is : "+addr);
		System.out.println("Mob Num  is : "+num);
		
	}

}
