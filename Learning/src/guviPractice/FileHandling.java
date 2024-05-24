package guviPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\codeCreatedFiles\\JavaFile.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		Scanner sc= new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		FileWriter fw = new FileWriter("F:\\codeCreatedFiles\\JavaFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("This is crreated by Code");
		bw.close();
		fw.close();

	}

}
