package guviAssignment;

public class NumString {
	
	private int num;
	public NumString(int num) {
		this.num=num;
	}
	public String getNumString()
	{
		String res=Integer.toString(num);
		return res;
	}
	
	public void print(int num)
	{
		NumString obj=new NumString(num);
		String str=obj.getNumString();
		System.out.println(str);
	}

}
