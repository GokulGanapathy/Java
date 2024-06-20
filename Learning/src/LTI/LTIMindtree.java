package LTI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class LTIMindtree {

	public static void main(String[] args) {
		List<HashMap<String,String>> lis = new ArrayList<>();
		HashMap<String,String> map1 = new HashMap<>();
		map1.put("Name", "Kohli");
		map1.put("Jersey", "18");
		
		HashMap<String,String> map2 = new HashMap<>();
		map2.put("Name", "Kohli");
		map2.put("Jersey", "45");
		
		lis.add(map1);
		lis.add(map2);
		
		for(int i=0;i<lis.size();++i) {
			Set<Entry<String,String>> set = lis.get(i).entrySet();
			
			Iterator<String> itr =  lis.get(i).keySet().iterator();
			while(itr.hasNext()) {
				String key = itr.next();
				String value = lis.get(i).get(key);
				System.out.println("Key : "+key+" Value : "+value);
			}
		}
		
		if(map1.containsKey("Name2") && map1.get("Name2").equals(map2.get("Name"))) {
			System.out.println(true);
		}
	}

}
