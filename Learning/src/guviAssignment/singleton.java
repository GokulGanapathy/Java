package guviAssignment;

public class singleton {
	
	private static singleton instance;			//Class Variable for Instantiating
	
	private String value;
	
	private singleton() {
		//Private constructor to avoid Instantiating in main method
	}
	
	public static singleton getInstance() {
		if(instance==null)						//Instantiating the object here itself and it can be called at main method without instantiating
		{
			instance=new singleton();
		}
		return instance;
	}
	
	public void setValue(String value) {
		this.value=value;						//Setter for String Value
	}
	
	public String getValue()
	{
		return value;							//Getter for String value
	}

}
