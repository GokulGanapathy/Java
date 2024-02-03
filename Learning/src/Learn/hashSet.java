package Learn;
import java.util.*;

public class hashSet {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		HashSet<String> players=new HashSet<>();		// Defining a Hash that is Unordered and Unique value of collections
		
		System.out.println(players.isEmpty());
		
		for(int i=0;i<11;++i)
		{
			players.add(sc.next());
		}
		
		System.out.println(players);
		
		System.out.println(players.size());
		
		Iterator<String> itr=players.iterator();		// Using Iterator to get through the collection HashSet
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
