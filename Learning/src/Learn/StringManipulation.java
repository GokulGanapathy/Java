package Learn;
import java.util.*;
import java.lang.*;

public class StringManipulation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String[] address=new String[4];
		int pin=0;
		for(int i=0;i<4;++i)
		{
			
			address[i]=sc.nextLine();
			String[] strArr=new String[7];
			strArr=address[i].split(",");
			System.out.println("Name : "+strArr[0]);
			if(strArr[2].contains("Mason Street"))
			{
				System.out.println("Address : "+strArr[2]);
			}
			if(strArr[6].contains("Pin"))
			{
				System.out.println("Pin_Code : "+strArr[6]);
				pin++;
			}
				
		}
		if(pin==4)
		{
			System.out.println("All Address has PinCode");
		}
	
		/*String address1 = "Mr.Jack - Door No 21,Mason Street,3rd Main Road,Velachery,Chennai - Pin-600113";
		String address2 = "Ms Jill - Door No 53,Mason Street,3rd Main Road,Velachery,Chennai - Pin-600113";
		String address3 = "Mr Holmes - Door No 13,Valmiki Street,32d Main Road,Saidapet,Chennai - Pin-600115";
		String address4 = "Mr.Davinci - Door No 21,Mason Street,3rd Main Road,Velachery,Chennai - Pin-600113";
		String[] arr1=new String[3];
		String[] arr2=new String[3];
		String[] arr3=new String[3];
		String[] arr4=new String[3];
		arr1=address1.split("-");
		arr2=address2.split("-");
		arr3=address3.split("-");
		arr4=address4.split("-");
		
		//Printing Names
		
		System.out.println("Name1 : "+arr1[0]);
		System.out.println("Name2 : "+arr2[0]);
		System.out.println("Name3 : "+arr3[0]);
		System.out.println("Name4 : "+arr4[0]);
		
		if(address1.contains("Mason Street"))
		{
			System.out.println("Address1 : "+arr1[1]);
		}
		if(address2.contains("Mason Street"))
		{
			System.out.println("Address2 : "+arr2[1]);
		}
		if(address3.contains("Mason Street"))
		{
			System.out.println("Address3 : "+arr3[1]);
		}
		if(address4.contains("Mason Street"))
		{
			System.out.println("Address4 : "+arr4[1]);
		}
		
		if(address1.contains("Pin"))
		{
			
		}*/
	}

}
