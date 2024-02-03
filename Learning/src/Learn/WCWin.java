package Learn;

public class WCWin {

	public static void main(String[] args) {
		
		WCWin wc=new WCWin(); 				//Since its not a static method we are using object and accessing from objects
		String res = wc.wc2023();
		System.out.println(res);
		
		String res2=WTC2025();				//Since its a Static method we no need to give static method
		System.out.println(res2);
		
		WCT2025 wct2025=new WCT2025(); 		//Accessing other Classes's Object
		wct2025.wct();
	}
	
	public String wc2023() 					//This is not a Static method
	{ 	
		return "Have to get 12 points min and be on top 4 to get into semi's";
	}
	
	public static String WTC2025() {  		//This is a Static method
		return "Have to finish on Top2 of  WTC Cycle";
	}

}
