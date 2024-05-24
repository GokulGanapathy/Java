package Learn;

import java.util.Hashtable;

public class hashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<>();
		ht.put(1,"KKR");
		ht.put(2,"RR");
		ht.put(3,"CSK");
		ht.put(4,"SRH");
		ht.put(5,"DC");
		ht.put(6,"RCB");
		
		ht.entrySet();
	}

}
