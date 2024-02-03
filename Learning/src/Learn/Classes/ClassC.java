package Learn.Classes;

public class ClassC extends ClassB {

	public static void main(String[] args) {
		
		ClassB objB=new ClassB();
		String vill=objB.nativeVill;
		System.out.println(vill);
		objB.printA();
		objB.printB();
		System.out.println(objB instanceof ClassA);

	}

}
