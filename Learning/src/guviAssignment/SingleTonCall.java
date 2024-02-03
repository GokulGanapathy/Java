package guviAssignment;

public class SingleTonCall  {

	public static void main(String[] args) {
		singleton Singleton=singleton.getInstance();   // Object is not created we are just getting instance from singleton class
		Singleton.setValue("This is Value name");
		String res1=Singleton.getValue();
		System.out.println(res1);	
		
		
		//Can get any number of this instance without instantiating as a new Object here as it saves memory
		
		singleton newinstance=singleton.getInstance();
		newinstance.setValue("This another Instance of the same");
		System.out.println(newinstance.getValue());
		
	}

}
