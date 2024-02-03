package guviAssignment;

public class String1 {
	private String name;
	public String1(String name)
	{
		this.name=name;
	}
	
	public String getString()
	{
		return name;
	}
	
	public static void main(String args[])
	{
		String1 obj=new String1("Gokul");
		String str=obj.getString();
		boolean res=str.equalsIgnoreCase("gokul");
		System.out.print(res);
	}
}
