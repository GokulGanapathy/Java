package guviAssignment;

public class veeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aa12bc3e4f";
		int sum=0;
		for(int i=0;i<s.length();++i)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				//System.out.println("IF");
				int x=Integer.parseInt(String.valueOf(s.charAt(i)));
				sum=sum+x;
				//System.out.println(sum);
			}
		}
		System.out.println(sum);
	}
}
