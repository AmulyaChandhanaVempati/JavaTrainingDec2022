package inClassDay15_12_2022;

class Parent {
	public void show1() {
		System.out.println("Show1 method of Parent");
	}
	public void show2() {
		System.out.println("Show2 method of Parent");
	}
	public void xyz() {
		
	}
}
class Child extends Parent{
	@Override
	public void show1() {
		System.out.println("Show1 method of Child");
	}
	
	@Override
	public void show2() {
		System.out.println("Show2 method of Child");
	}
	public void show3() {
		System.out.println("Show3 method of Child");
	}
}
public class Demo1 extends Parent {
	public static void main(String[] args) {
		Parent p = new Child();
		p.show1();
	    p.show2();
	    double d = 0/0.0;
	    System.out.println(d);

	}

}

