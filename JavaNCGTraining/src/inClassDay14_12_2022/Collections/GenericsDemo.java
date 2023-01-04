package inClassDay14_12_2022.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("Amulya");
		list.add(new Salary(23,67));
		System.out.println(list);
		System.out.println(list.indexOf("Amulya"));
		ArrayList list2 = new ArrayList();
		list2.addAll(list);
		System.out.println(list2);
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("....................");
		for(Object obj : list) {
			System.out.println(obj);
		}
		

	}

}
class Salary{
	private int HRA;
	private int DA;
	
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salary(int hRA, int dA) {
		super();
		HRA = hRA;
		DA = dA;
	}
	public int getHRA() {
		return HRA;
	}
	public void setHRA(int hRA) {
		HRA = hRA;
	}
	public int getDA() {
		return DA;
	}
	public void setDA(int dA) {
		DA = dA;
	}
	@Override
	public String toString() {
		return "Salary [HRA=" + HRA + ", DA=" + DA + "]";
	}
	
	
}
