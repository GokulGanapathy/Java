package Learn;
import java.util.*;
import java.lang.*;

public class ArrayLi {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		ArrayList<String> str=new ArrayList<>();
		for(int i=0;i<5;++i)
		{
			String st=sc.next();
			str.add(st);
		}
		/*while(true)
		{
			String st=sc.nextLine();
			if(st!=null)
			{
				str.add(st);
			}
			else
			{
				break;
			}
			
		}*/
		Collections.sort(str);;
		int len=str.size();
		System.out.println(len);
		for(String s:str)
		{
			System.out.println(s);
		}
		
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
