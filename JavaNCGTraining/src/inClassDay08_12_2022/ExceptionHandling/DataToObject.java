package inClassDay08_12_2022.ExceptionHandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
public class DataToObject {
	public static void main(String[] args) throws IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\cvempati\\Downloads\\Employee.txt");
		//BufferedInputStream br = new BufferedInputStream(f1);
		DataInputStream dis = new DataInputStream(f1);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee emp = new Employee();
		String line = null;
		while((line = dis.readLine())!=null) {
			String[] str = line.split(",");
			emp.setEmpId(Integer.parseInt(str[0]));
			emp.setEmpName(str[1]);
			emp.setSalary(Integer.parseInt(str[2]));
			emp.setEmpmobile(Long.parseLong(str[3]));
			emp.setEmpmailId(str[4]);
		}
		System.out.println(emp.toString());
	}
}
