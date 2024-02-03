package Learn;
import java.util.*;


public class hashMap {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		HashMap<String,Integer> score=new HashMap<>();		//Creating a hash Map
		
		for(int i=0;i<3;++i)
		{
			score.put(sc.next(), sc.nextInt());				// Storing elements in Hash map
		}
		System.out.println(score);			//Output - {Rohit=12, Jaiswal=151, Pant=49, Gill=130, Jadeja=46, Kohli=100, Ashwin=20, Siraj=1, Rahane=56, Shami=20, Bumrah=10}
		
		if(score.containsKey("Kohli"))
		{
			System.out.println(score.replace("Kohli", 183, 246));
		}
		System.out.println(score.get("Kohli"));
		//score.clear();
		System.out.println(score);
		
		int TeamTotal=0;
		Iterator<String> itr=score.keySet().iterator();		//Defining Iterator
		while(itr.hasNext())
		{
			String player=itr.next();						//Getting key
			TeamTotal=TeamTotal+(score.get(player));
		}
		System.out.println(TeamTotal);

	}

}
