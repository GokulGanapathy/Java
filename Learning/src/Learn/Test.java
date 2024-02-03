package Learn;

import java.util.*;
class Test
{
public static void main (String[] args)
{
	Object obj = new Object()
	{
	public int hashCode()
	{
	return 42;
	}
	};
	System.out.println(obj.hashCode());
}




}

/*{
Object i = new
ArrayList().iterator();
        System.out.print((i instanceof List));
System.out.print((i instanceof Iterator));
System.out.print(i instanceof ListIterator);
}*/

/*
class A
{
final public int GetResult(int a, int b)
{
return 0;
}
}
class B extends A
{
public int GetResult(int a, int b)
{
return 1;
}
}*/
/*public class Test
{
	public static void main (String args[])
	{
		B b = new B();
		System.out.println(b.GetResult(0, 1));
	/*String str = NULL;
	 System.out.println(str);*/
	
/*public static void leftshift(int i, int j)
{
	int x=i<<j;
}
public static void main(String args[])
{
int i = 4, j = 2;
leftshift(i, j);
System.out.println(i);
}*/

