package Learn.AbstractClas;

public class Tamils extends Indians{

	public static void main(String[] args) {
		Tamils tamObj=new Tamils();
		tamObj.CitizenofOtherCountry();
		tamObj.haveBreakfast();
		tamObj.votersId();

	}

	@Override
	void haveBreakfast() {
		System.out.println("Had Idli in TN");
		
	}

}
