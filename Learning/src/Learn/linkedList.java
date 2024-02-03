package Learn;
import java.util.*;

public class linkedList {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		LinkedList<String> list=new LinkedList<>();   //Creating a Linked List Collection
		
		for(int i=0;i<9;++i)
		{
			list.add(sc.nextLine());
		}
		
		System.out.println(list);
		
		//AddFirstElement
		
		list.addLast("Arshdeep");
		//list.addFirst("Rohit");
		
		boolean rahane=list.contains("Rahane");
		System.out.println(rahane);
		
		System.out.println(list);
		
		list.addFirst("Gill");
		list.remove("Rohit");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("This no,6 batsman is "+list.get(5));
		for(String res:list)
		{
			System.out.println(res);
		}
	}

}
