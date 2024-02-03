package guviAssignment;

public class SingleTonString {

	private String value;
	private static SingleTonString instance;
	
	private SingleTonString() {
		//Private Constructor , It cannot be called in any other Classes
	}
	
	public void setValue(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}	
	
	public static SingleTonString getInstance(){
		if(instance == null)
		{
			instance = new SingleTonString();		//Creating a Singleton String object and instantiating only here
		}
		return instance;
	}
	

}
