package guviAssignment;

import java.util.Scanner;

enum zipcode{
	Thiruvengadam("627719"),
	Chrompet("600044"),
	Chennai("6000001");
	
	public String ids;
	zipcode(String ids) {
		this.ids=ids;
	}
	public void getZipCode()
	{
		System.out.println(ids);
	}
};

public class enumZipCodes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city name to get Zip Code : Thiruvengadam|Chennai|Chrompet");
		//String str=sc.next();
		zipcode z=zipcode.Thiruvengadam;
		z.getZipCode();

	}

}
