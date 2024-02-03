package Learn;

public class enumeration {
	
	public enum Depart{					//creating a new dataType by using enumerate
		Developer,
		QualityAssurance,
		Support,
		TechSupport,
		HR,
		Management,
		Maintanence,
		Food
	}
	
	private String name;				// Creating new variables
	private int age;
	private long salary;
	private Depart dept;
	
	public enumeration(String name,int age,long salary,Depart dept) 	//Setter Constructor method
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.dept=dept;
	}
	public void displayData()											//Getter method
	{
		System.out.println("Name is : "+name+"\n"+"Age is : "+age+"\n"
							+"Salary is : "+salary+"\n"+"Department : "+dept);
		if(dept==Depart.QualityAssurance)
		{
			System.out.println(name +" is working in QA as a "+dept);
		}
		else
		{
			System.out.println(name +" is not working in QA and is working as "+dept);
		}
		
	}
	
	
	public enum activity{
		Working("Y"),
		Left("N");
		
		private String act;
		activity(String s) {
			act=s;
		}
		String getActivity() {
			return act;
		}
	}
	
	
	
	public static void main(String args[])						//main method
	{
		Depart d=Depart.Developer;								//Calling and creating new enumerate variable constant
		enumeration e=new enumeration("Gokul",23,35000,d);		//Creating new Object
		e.displayData();										//calling Function of printing data
		System.out.println("Currently Working : "+activity.Working.getActivity());
		
	}

}
