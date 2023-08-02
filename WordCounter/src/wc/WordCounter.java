package wc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Please Enter A Text of a File Location: ");
		System.out.println("Only '.txt' files are allowed");
		Scanner scan = new Scanner(System.in);
		String TextOrFile = scan.nextLine();
		if(TextOrFile.endsWith(".txt")) {
			File file = new File(TextOrFile);
			Scanner scanner=null;
			try {
				scanner = new Scanner(file);
				while(scanner.hasNextLine()) {
					String Line = scanner.nextLine();
					count = count+Line.split(" ").length;
				}
				System.out.println("Word countered: "+count);
			} catch (FileNotFoundException e) {
				System.out.println("File Not found!!!!");
				System.out.println("Please Enter Absolute Location Of the file: ");
			}
		}else {
			String words[];
			words=TextOrFile.split(" ");
			count = words.length;
			System.out.println("words countered: "+count);
		}
		
		scan.close();
	}

}
