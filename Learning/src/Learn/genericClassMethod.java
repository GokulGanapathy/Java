package Learn;

public class genericClassMethod<Generic> {
	
	public Generic a;
	public Generic b;
	public Generic c;
	
	public void output(Generic a,Generic b,Generic c)
	{
		System.out.println(a+" "+b+" "+c);
	}
	
	/* We have not Defined any DataType to this Class
	 * 
	 * All are defined as a Generic DataType
	 */

}
