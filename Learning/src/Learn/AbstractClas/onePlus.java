package Learn.AbstractClas;

public class onePlus implements SmartPhone {   // Since SmartPhone is a Interface we have to give 
																	//	as implements instead of Extends

	public static void main(String[] args) {
		onePlus onpl=new onePlus();
		onpl.Browsing();
		onpl.calling();
		onpl.camera();
		onpl.computing();

	}
	@Override
	public void calling() {
		System.out.println("We can make a Call in SmartPhone");
		
	}

	@Override
	public void Browsing() {
		System.out.println("We can do Browsing in SmartPhone");
		
	}

	@Override
	public void camera() {
		System.out.println("We can take photos/Videos in SmartPhone");
		
	}

	@Override
	public void computing() {
		System.out.println("We can do Computing in SmartPhone");
		
	}

}
