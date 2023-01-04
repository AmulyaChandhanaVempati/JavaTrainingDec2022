package inClassDay15_12_2022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;


public class FileLearning {
	public static void main(String args[]) throws IOException {
		Reader fr = new FileReader("C:\\Users\\cvempati\\Downloads\\Movie.txt");
		BufferedReader br = new BufferedReader(fr);
//		FileWriter fw = new FileWriter("C:\\\\Users\\\\cvempati\\\\Downloads\\\\MovieOutput.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		String str=null;
	    
		while((str = br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(str," ");
			
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}
			
		}
		String stsdr="s a aad dsfkjalsdjf asdjfil ajlasj \n odhfl asflad sfld sdf";
		System.out.println(stsdr);
		String a[]=stsdr.split(" ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		String s="s,fff,www";
		StringTokenizer st =new StringTokenizer(s,",");
		System.out.println("String Tokenizer:  "+st);
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		br.close();
		//bw.close();
		
	}
 
}
