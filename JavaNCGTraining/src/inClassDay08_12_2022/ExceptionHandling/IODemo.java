package inClassDay08_12_2022.ExceptionHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class IODemo {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\cvempati\\Downloads\\input.txt");
		//FileReader f1 = new FileReader("C:\\Users\\cvempati\\Downloads\\input.txt");
		FileOutputStream output = new FileOutputStream("C:\\Users\\cvempati\\Downloads\\output.txt");
		//BufferedInputStream b1 = new BufferedInputStream(f);
		int line =0;
		while((line=f.read())!=-1) {
			System.out.println(line);
			//output.write((char)line);
		}
		f.close();
		output.close();
	}
}

