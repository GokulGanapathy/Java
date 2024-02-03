package Learn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("E, MMM dd YYYY");
		String dt = sdf.format(new Date());
		System.out.println(dt);
		

	}

}
