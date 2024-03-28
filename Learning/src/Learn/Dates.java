package Learn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Dates {

	public static void main(String[] args) throws ParseException, IOException {
		
		String dt1="09-05-2000";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf1.parse(dt1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("E, MMM dd YYYY",Locale.ENGLISH);
		String st=sdf.format(date);
		System.out.println(st);
		
		//String dt = sdf.format(new Date());
		
		System.out.println(new Date());
		LocalDate datel= LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("E,MMM dd yyyy");
		System.out.println(datel.format(format));
		System.out.println(datel.isLeapYear());
		System.out.println(datel.getDayOfYear());
		System.out.println(datel.getYear());
		
		File file = new File("F:\\JavaFiled\\file1.txt");
		/*
		 * System.out.println(file.canWrite()); file.setWritable(true); FileWriter fw =
		 * new FileWriter(file); fw.write("This is the File that was created now");
		 * fw.close();
		 */
		
		file.canRead();
		file.setReadable(true);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String res = br.readLine();
		System.out.println(res);
		br.close();
		fr.close();
		
	}

}
