package Learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapEntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"KKR");
		map.put(2,"RR");
		map.put(3,"CSK");
		map.put(4,"SRH");
		map.put(5,"DC");
		map.put(6,"RCB");
		ArrayList<String> valuesInMap = new ArrayList<>(map.values());
		System.out.println(valuesInMap);
		
		Set<Entry<Integer, String>> entryset = map.entrySet();
		Iterator<Entry<Integer, String>> itr = entryset.iterator();
		while(itr.hasNext()) {
			Map.Entry mp = (Map.Entry)itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
